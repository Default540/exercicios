DROP DATABASE IF EXISTS trab1;
CREATE DATABASE trab1;
\c trab1;

--DROP PROCEDURE IF EXISTS registrar_novo_emprestimo;
--DROP PROCEDURE IF EXISTS registrar_devolucao;
--DROP FUNCTION IF EXISTS multa;
--DROP PROCEDURE IF EXISTS registrar_nova_devolucao;
--DROP FUNCTION IF EXISTS estatistica_emprestimos;
--DROP PROCEDURE IF EXISTS excluir_livro;
--DROP FUNCTION IF EXISTS disponibilidade_livro;
--DROP PROCEDURE IF EXISTS atualizar_livro;

---------------------------------------------

--DROP TABLE IF EXISTS emprestimo CASCADE;
--DROP TABLE IF EXISTS membro CASCADE;
--DROP TABLE IF EXISTS exemplar CASCADE;
--DROP TABLE IF EXISTS livro CASCADE;
--DROP TABLE IF EXISTS tipo_livro CASCADE;
--DROP TABLE IF EXISTS livro_tipo CASCADE;
--DROP TABLE IF EXISTS autor CASCADE;
---DROP TYPE IF EXISTS status_enum CASCADE;

----------------------------------------------

CREATE TABLE autor (
	id serial primary key,
	nome CHARACTER VARYING(100) not null
);

INSERT INTO autor(nome) values('David');
INSERT INTO autor(nome) values('Carnaval');

----------------------------------------------


CREATE TABLE tipo_livro(
	id SERIAL primary key,
	tipo CHARACTER VARYING(50) NOT null
);

INSERT INTO tipo_livro (tipo) VALUES ('terror'), ('religioso'), ('comedia');

-----------------------------------------------


CREATE TABLE livro (
	id serial primary key,
	titulo character varying(200) not null,
	data_lancamento date,
	autor_id integer references autor (id) 
);

INSERT INTO livro (titulo, autor_id) VALUES 
('biografia n-autorizada', 1),
('biografia n-autorizada2', 1),
('biografia n-autorizada7', 2);

--------------------------------------------------

CREATE TABLE livro_tipo(
	livro_id INTEGER REFERENCES livro(id),
	tipo_id INTEGER REFERENCES tipo_livro(id),
	primary key (livro_id, tipo_id)
);


INSERT INTO livro_tipo VALUES (1,1),(2,2),(3,1),(3,2);


--------------------------------------------------

CREATE TYPE status_enum AS ENUM ('disponivel', 'locado');

-----------------------------------------------

CREATE TABLE exemplar (
	id serial primary key,
	livro_id integer REFERENCES livro (id),
	status status_enum
);

INSERT INTO exemplar(livro_id, status) VALUES (1, 'disponivel');
INSERT INTO exemplar(livro_id, status) VALUES (1, 'disponivel');
INSERT INTO exemplar(livro_id, status) VALUES (1, 'disponivel');
INSERT INTO exemplar(livro_id, status) VALUES (2, 'disponivel');
INSERT INTO exemplar(livro_id, status) VALUES (2, 'disponivel');
INSERT INTO exemplar(livro_id, status) VALUES (3, 'disponivel');

--------------------------------------------------

CREATE TABLE membro (
	id serial primary key,
	nome CHARACTER varying(100) not null,
	data_nascimento date,
	email character varying(100) unique not null,
	senha character varying(100) not null
);

INSERT INTO membro (nome, email, senha) VALUES ('IGOR', 'igor.pereira@riogrande.ifrs.edu.br', md5('123'));

--------------------------------------------------

CREATE TABLE emprestimo (
	id serial primary key,
	membro_id integer REFERENCES membro (id),
	exemplar_id integer REFERENCES exemplar (id),
	valor_multa numeric(10,2) default 0 CHECK(valor_multa >= 0),
	data_hora_entrega timestamp,
	data_hora_emprestimo TIMESTAMP default CURRENT_TIMESTAMP,
	data_hora_devolucao timestamp DEFAULT CURRENT_TIMESTAMP + interval '7 days'
);

--------------------------------------------------

-- 1) Criar uma stored procedure para registrar um novo empréstimo de livro.

CREATE OR REPLACE PROCEDURE registrar_novo_emprestimo(exemplar_id_aux bigint, membro_id_aux bigint) AS
$$
BEGIN

	IF ((SELECT status FROM exemplar WHERE id = exemplar_id_aux) = 'disponivel') THEN

		INSERT INTO emprestimo (exemplar_id, membro_id) values (exemplar_id_aux, membro_id_aux);

		UPDATE exemplar SET status = 'locado' WHERE id = exemplar_id_aux;
	
	ELSE
		RAISE NOTICE 'O exemplar ja esta locado';
	END IF;
end;
$$ language 'plpgsql';

--------------------------------------------------

-- 2) Criar uma stored procedure para registrar uma devolução de livro: Criar uma stored procedure que registre a devolução de um livro, atualizando o status do livro e calculando a multa por atraso se houver.
-- Parâmetros: id_exemplar, id_membro, data_devolucao
-- Retorno: mensagem (mensagem de sucesso ou erro)


CREATE OR REPLACE PROCEDURE registrar_devolucao(id_exemplar_aux bigint, id_membro_aux bigint, data_entrega_aux date) as 
$$
BEGIN

    UPDATE emprestimo set data_hora_entrega = data_entrega_aux, valor_multa = (multa(id, 1.5)) WHERE membro_id = id_membro_aux AND exemplar_id = id_exemplar_aux;

	UPDATE exemplar SET status = 'disponivel' WHERE id = id_exemplar_aux;

	RAISE NOTICE 'A devoluçao foi feita';
end;
$$ language 'plpgsql';



------------------------------------------------

-- 3)Criar uma function para calcular a multa por atraso na devolução de um livro. Obs: R$ 1,50 por cada dia de atraso. Criar uma function que calcule a taxa de empréstimo de livro com base no tempo de empréstimo e no tipo de livro.
--Parâmetros: id_livro, data_emprestimo, data_devolucao
--Retorno: taxa_emprestimo (valor da taxa de empréstimo)

CREATE OR REPLACE FUNCTION multa(emprestimo_id_aux bigint, valor_por_dia_de_atraso numeric(8,2)) RETURNS numeric(10,2) as 
$$
DECLARE	
	valor_multa_aux numeric(8,2) := 0;
BEGIN
	
    select (
        cast(data_hora_entrega as date) - cast(data_hora_devolucao as date)
        )::integer
        
        * valor_por_dia_de_atraso from emprestimo where id = emprestimo_id_aux into valor_multa_aux;

	IF (valor_multa_aux > 0) THEN
		return valor_multa_aux;
	ELSE 
		RETURN 0;
	END IF;

END;
$$ LANGUAGE 'plpgsql';

------------------------------------------------

-- 4)Implementar uma stored procedure para registrar uma renovação de empréstimo Criar uma stored procedure que registre a renovação de um empréstimo de livro, atualizando o status do livro e calculando a nova data de devolução.
--Parâmetros: id_livro, id_membro, data_renovação
--Retorno: mensagem (mensagem de sucesso ou erro)


CREATE OR REPLACE PROCEDURE registrar_nova_devolucao(id_exemplar_aux bigint, id_membro_aux bigint, data_renovacao_aux date) as
$$
begin

    UPDATE emprestimo set data_hora_devolucao = data_renovacao_aux WHERE membro_id = id_membro_aux AND exemplar_id = id_exemplar_aux;
	
	UPDATE emprestimo set valor_multa = 0.0 WHERE membro_id = id_membro_aux AND exemplar_id = id_exemplar_aux;

	RAISE NOTICE 'Uma nova devolução foi feita';

end;
$$ language 'plpgsql';

------------------------------------------------

-- 5) Implementar uma stored procedure para atualizar as informações de um membro.
--Criar uma function para calcular a estatística de empréstimos por membro Criar uma function que calcule a estatística de empréstimos por membro, incluindo o número de empréstimos feitos, o número de devoluções feitas e a taxa de devolução.
--Parâmetros: id_membro
--Retorno: valor real

CREATE OR REPLACE FUNCTION estatistica_emprestimos(id_membro bigint)
RETURNS TABLE (
	id_do_membro bigint,
	total_de_emprestimos INTEGER,
	total_de_devolucoes INTEGER,
	taxa_de_devolucao REAL
) AS $$
---------------------------------
BEGIN
	RETURN QUERY
    SELECT
        e.membro_id::bigint AS id_do_membro,
        COUNT(*)::INTEGER AS total_de_emprestimos,
        COUNT(data_hora_entrega)::INTEGER AS total_de_devolucoes,
         CASE
            WHEN COUNT(*) = 0 THEN 0  -- Evitar divisão por zero
            ELSE ((COUNT(e.data_hora_entrega)::REAL / COUNT(*)::REAL) * 100)::REAL
        END AS taxa_de_devolucao
    FROM emprestimo e
    WHERE e.membro_id = id_membro
    GROUP BY e.membro_id;
END;
$$ LANGUAGE 'plpgsql';

------------------------------------------------

-- 6)Implementar uma stored procedure para excluir um livro do catálogo. Criar uma stored procedure que exclua um livro do catálogo, atualizando a tabela de livros e removendo qualquer registro de empréstimo ou devolução relacionado ao livro. PS: não esquecer dos exemplares.
--Parâmetros: id_livro
--Retorno: mensagem (mensagem de sucesso ou erro)

CREATE OR REPLACE PROCEDURE excluir_livro(id_livro bigint) AS 
$$
BEGIN
	DELETE FROM emprestimo WHERE exemplar_id IN (SELECT id FROM exemplar WHERE livro_id = id_livro); ---------------------------
	DELETE FROM exemplar WHERE livro_id = id_livro;
	DELETE FROM livro WHERE id = id_livro;

	RAISE NOTICE 'O livro foi removido';
END;
$$ LANGUAGE 'plpgsql';

-- 7) Criar uma function para calcular a disponibilidade de livros em estoque. Criar uma function que calcule a disponibilidade de livros em estoque, considerando a quantidade de livros em estoque e a quantidade de livros emprestados.
--Parâmetros: id_livro
--Retorno: disponibilidade (quantidade de livros disponíveis)

CREATE OR REPLACE FUNCTION disponibilidade_livro(id_livro bigint)
RETURNS INTEGER AS 
$$
DECLARE
	resultado INTEGER;
BEGIN
	SELECT COUNT(*) INTO resultado FROM exemplar WHERE livro_id = id_livro AND status = 'disponivel';
	return resultado;
END;
$$ LANGUAGE 'plpgsql';

-- 8) Implementar uma stored procedure para atualizar as informações de um livro Criar uma stored procedure que atualize as informações de um livro, incluindo o título, autor, editora, etc.
--Parâmetros: id_livro, titulo, autor, editora, etc.
--Retorno: mensagem (mensagem de sucesso ou erro)

CREATE OR REPLACE PROCEDURE atualizar_livro(id_livro bigint, novo_titulo CHARACTER, nova_data_lancamento DATE, novo_id_autor BIGINT, tipos INTEGER[]) AS 
$$
BEGIN
	UPDATE livro SET titulo = novo_titulo, data_lancamento = nova_data_lancamento, autor_id = novo_id_autor WHERE id = id_livro;

    DELETE FROM livro_tipo WHERE livro_id = id_livro;

	INSERT INTO livro_tipo (livro_id, tipo_id) SELECT id_livro, unnest_tipo FROM unnest(tipos) AS unnest_tipo;

	RAISE NOTICE 'O livro foi atualizado';

END;
$$ LANGUAGE 'plpgsql';


-- 9) Criar uma function para calcular a estatística de devoluções por tipo de livro Criar uma function que calcule a estatística de devoluções por tipo de livro, incluindo o número de devoluções feitas e a taxa de devolução.
--Parâmetros: id_tipo_livro
--Retorno: valor real


CREATE OR REPLACE FUNCTION estatistica_livro(id_tipo_livro BIGINT)
RETURNS TABLE (
	tipo_do_livro CHARACTER VARYING(50),
	total_de_livros INTEGER,
	total_de_devolucoes INTEGER,
	taxa_de_devolucao REAL
) 
AS $$
DECLARE
    nome_tipo CHARACTER VARYING (50);
	quant_livros INTEGER;
	total_devolucoes INTEGER;
BEGIN
	
    SELECT tl.tipo INTO nome_tipo FROM tipo_livro AS tl WHERE id = id_tipo_livro;
	

	SELECT COUNT(e.id) FROM exemplar AS e 
	INNER JOIN livro as l ON e.livro_id = l.id 
	INNER JOIN livro_tipo AS lt ON lt.livro_id = l.id 
	INNER JOIN tipo_livro AS tl ON tl.id = lt.tipo_id WHERE tl.id = id_tipo_livro INTO quant_livros;
	
	SELECT COUNT(em.data_hora_entrega) FROM livro AS l INNER JOIN livro_tipo AS lt ON lt.livro_id = l.id INNER JOIN tipo_livro AS tl ON tl.id = id_tipo_livro INNER JOIN exemplar AS ex ON ex.livro_id = l.id INNER JOIN emprestimo AS em ON em.exemplar_id = ex.id WHERE em.data_hora_entrega IS NOT NULL INTO total_devolucoes;
	
	
	RETURN QUERY
		SELECT 
        nome_tipo AS tipo_do_livro, 
        quant_livros::INTEGER AS total_de_livros, 
        total_devolucoes::INTEGER AS total_de_devolucoes, 
        CASE
            WHEN quant_livros = 0 THEN 
            0::REAL
            ELSE 
            (total_devolucoes::REAL / quant_livros::REAL * 100)::REAL 
        END AS taxa_de_devolucao;
END;
$$ LANGUAGE 'plpgsql';




-- 10) Realizar operações de inserção, atualização e exclusão utilizando as stored procedures. Escrever queries para testar as stored procedures e functions criadas.


CALL registrar_novo_emprestimo(1, 1);
CALL registrar_novo_emprestimo(2, 1);
CALL registrar_novo_emprestimo(3, 1);
CALL registrar_novo_emprestimo(4, 1);

CALL registrar_devolucao(1,1,CURRENT_DATE + 30);
CALL registrar_devolucao(2,1,CURRENT_DATE + 50);


CALL registrar_nova_devolucao(1,1, CURRENT_DATE + 70);


SELECT * FROM estatistica_emprestimos(1);

CALL excluir_livro(1);

SELECT disponibilidade_livro(3);

CALL atualizar_livro(3, 'biografia autorizada 2.0', CURRENT_DATE, 1, ARRAY[3,2]);

SELECT * FROM estatistica_livro(2);

