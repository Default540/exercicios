CREATE DATABASE cinema;

\c cinema

CREATE SCHEMA externo;
CREATE SCHEMA interno;



CREATE TABLE externo.telespectador(
    id SERIAL PRIMARY KEY,
    cpf CHARACTER(11) UNIQUE,
    nome TEXT NOT NULL
);

CREATE TABLE sala(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    capacidade INTEGER CHECK (capacidade > 0)
);


CREATE TABLE externo.filme(
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    duracao INTEGER CHECK (duracao > 0)
);

CREATE TABLE externo.sessao(
    id SERIAL PRIMARY KEY,
    filme_id INTEGER REFERENCES externo.filme(id),
    sala_id INTEGER REFERENCES sala(id),
    data DATE NOT NULL,
    hora TIME NOT NULL
);

CREATE TABLE externo.ingresso(
    id SERIAL PRIMARY KEY,
    telespectador_id INTEGER REFERENCES externo.telespectador(id),
    sessao_id INTEGER REFERENCES externo.sessao(id),
    valor_ingresso REAL,
    corredor CHARACTER(1) NOT NULL,
    poltrona INTEGER CHECK(poltrona > 0),
    valor_pago REAL
);

CREATE TABLE interno.setor(
    id SERIAL PRIMARY KEY,
    descricao TEXT,
    valor_por_hora REAL
);

CREATE TABLE interno.funcionario(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    setor_id INTEGER REFERENCES interno.setor(id)
);

CREATE TABLE interno.turno(
    sala_id INTEGER REFERENCES sala(id),
    funcionario_id INTEGER REFERENCES interno.funcionario(id),
    data_hora_entrada TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_hora_saida TIMESTAMP,

    PRIMARY KEY(sala_id, funcionario_id, data_hora_entrada)
);


INSERT INTO externo.telespectador (cpf, nome) VALUES 
('11111111111', 'nome1'),
('22222222222', 'nome2'),
('33333333333', 'nome3'),
('44444444444', 'nome4');

INSERT INTO sala(nome, capacidade) VALUES ('SALA A', 20),('SALA B', 100), ('SALA C', 40);

INSERT INTO externo.filme (titulo, duracao) VALUES ('vingadores', 10000), ('todo mundo em panico' , 22000), ('matrix' , 20000);

INSERT INTO externo.sessao (filme_id, sala_id, data, hora) VALUES 
(1,1, '30/10/2024','14:00'),
(2,1,'30/10/2024','14:00'),
(3,2,'20/04/2025','14:00');




INSERT INTO externo.ingresso (telespectador_id,sessao_id, valor_ingresso,corredor , poltrona, valor_pago) VALUES 

(1,1,10.5,'A',1,10.5), SELECT t.nome, t.cpf, COUNT(i.id), s.data FROM externo.telespectador AS t 

INNER JOIN externo.ingresso AS i ON i.telespectador_id = t.id 
INNER JOIN externo.sessao AS s ON s.id = i.sessao_id 
GROUP BY t.id, s.data
HAVING EXTRACT(YEAR FROM CURRENT_TIMESTAMP) = EXTRACT(YEAR FROM s.data) AND 
EXTRACT(MONTH FROM CURRENT_TIMESTAMP) = EXTRACT(MONTH FROM s.data);
(3,2, 7.75, 'B',2, 7.75),
(3,3, 15.10, 'C',1, 15.10), 

(4,2, 7.75, 'B',3, 7.75),
(4,3, 15.10, 'C',2, 15.10);



INSERT INTO interno.setor (descricao, valor_por_hora) VALUES ('setor1',10),('setor2',20),('setor3',30)

INSERT INTO interno.funcionario (nome,setor_id) VALUES ('funcionario1',1),('funcionario2',1),('funcionario3',2),('funcionario4',2),('funcionario5',3);

INSERT INTO interno.turno (sala_id, funcionario_id, data_hora_entrada,  data_hora_saida) 
VALUES 

(1,1, '29/10/2024 08:00', '29/10/2024 12:00'),(2,2,'29/10/2024 08:00', '29/10/2024 12:00'), 

(1,1,'29/10/2024 13:30', '29/10/2024 17:30'),(2,3,'29/10/2024 13:30', '29/10/2024 17:30'),(2,4,'29/10/2024 13:30', '29/10/2024 17:30'),

(1,2,'29/10/2024 19:00', '29/10/2024 23:00'),(1,3,'29/10/2024 19:00', '29/10/2024 23:00'),(2,4,'29/10/2024 19:00', '29/10/2024 23:00'),(2,5,'29/10/2024 19:00', '29/10/2024 23:00');


SELECT t.nome, t.cpf, COUNT(i.id), s.data FROM externo.telespectador AS t 

INNER JOIN externo.ingresso AS i ON i.telespectador_id = t.id 
INNER JOIN externo.sessao AS s ON s.id = i.sessao_id 
GROUP BY t.id, s.data
HAVING EXTRACT(YEAR FROM CURRENT_TIMESTAMP) = EXTRACT(YEAR FROM s.data) AND 
EXTRACT(MONTH FROM CURRENT_TIMESTAMP) = EXTRACT(MONTH FROM s.data);


SELECT sl.*, COUNT(i.id) FROM sala AS sl INNER JOIN externo.sessao AS s ON s.sala_id = sl.id INNER JOIN externo.ingresso AS i ON i.sessao_id = s.id GROUP BY sl.id HAVING AVG(i.id) >= 2 ORDER BY sl.id;


SELECT f.id, COUNT(f.id) FROM externo.filme AS f INNER JOIN externo.sessao AS s ON s.filme_id = f.id INNER JOIN externo.ingresso AS i ON i.sessao_id = s.id GROUP BY f.id 
HAVING COUNT(i.id) = 
    (SELECT COUNT(i.id) FROM externo.ingresso as i 
    INNER JOIN externo.sessao as s on i.sessao_id = s.id 
    INNER JOIN externo.filme as f ON f.id = s.filme_id 
    GROUP BY f.id ORDER BY COUNT(i.id) DESC LIMIT 1)
ORDER BY COUNT(i.id) DESC;


CREATE VIEW informacao AS 

SELECT  sala.nome, 
        externo.filme.titulo, 
        externo.telespectador.nome as nomeT, 
        externo.sessao.data,
        externo.sessao.hora 
        FROM sala 
        INNER JOIN externo.sessao ON externo.sessao.sala_id = sala.id 
        INNER JOIN externo.filme ON externo.filme.id = externo.sessao.filme_id INNER JOIN externo.ingresso ON externo.ingresso.sessao_id = externo.sessao.id 
        INNER JOIN externo.telespectador ON externo.telespectador.id = externo.ingresso.telespectador_id;


/* SELECT *, CASE 

        WHEN CAST(EXTRACT(HOUR FROM t.data_hora_entrada) as TIME) = '08:00' AND CAST(EXTRACT(HOUR FROM t.data_hora_saida) AS TIME) = '12:00' THEN 'Manha'

        WHEN CAST(EXTRACT(HOUR FROM t.data_hora_entrada) AS TIME) = '13:30' AND CAST(EXTRACT(HOUR FROM t.data_hora_saida) AS TIME) = '17:30' THEN 'Tarde'
        
        WHEN CAST(EXTRACT(HOUR FROM t.data_hora_entrada) AS TIME) = '19:00' AND CAST(EXTRACT(HOUR FROM t.data_hora_saida) AS TIME) = '23:00' THEN 'Noite'

END FROM interno.turno as t; */


