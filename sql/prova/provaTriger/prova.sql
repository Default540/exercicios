CREATE DATABASE escola;
--\c escola;

CREATE TABLE alunos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE diciplinas(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    carga_horaria INTEGER
);

CREATE TABLE matriculas(
    id SERIAL PRIMARY KEY,
    aluno_id INTEGER REFERENCES alunos(id),
    diciplina_id INTEGER REFERENCES diciplinas(id),
    data_matricula DATE
);

CREATE TABLE historico(
    id SERIAL PRIMARY KEY,
    aluno_id INTEGER REFERENCES alunos(id),
    diciplina_id INTEGER REFERENCES diciplinas(id),
    nota NUMERIC(2,1) CHECK (nota <= 10.0 AND nota >= 0.0) NOT NULL,
    aprovado BOOLEAN
);

CREATE TABLE log_matriculas(
    id SERIAL PRIMARY KEY,
    aluno_id INTEGER REFERENCES alunos(id),
    diciplina_id INTEGER REFERENCES diciplinas(id),
    data_log TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    acao VARCHAR(100)
);



CREATE OR REPLACE FUNCTION validacao_de_notas()
RETURNS TRIGGER AS $$
BEGIN

    IF NEW.nota IS NULL OR NEW.nota < 0.0 OR NEW.nota > 10.0 THEN
        RAISE EXCEPTION 'nota invalida';
    ELSE
        IF NEW.nota >=  6 THEN
            NEW.aprovado := TRUE;
        ELSE
            NEW.aprovado := FALSE;
        END IF;

        RETURN NEW;
    END IF;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_validacao_de_notas BEFORE UPDATE OR INSERT ON historico FOR EACH ROW
EXECUTE FUNCTION validacao_de_notas();


CREATE OR REPLACE FUNCTION auditoria_matricula()
RETURNS TRIGGER AS $$

BEGIN

    INSERT INTO log_matriculas (aluno_id, diciplina_id, acao) VALUES (NEW.aluno_id, NEW.diciplina_id, 'MATRICULA_INSERIDA');
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_validacao_de_notas AFTER INSERT ON matriculas FOR EACH ROW
EXECUTE FUNCTION auditoria_matricula();

CREATE OR REPLACE FUNCTION validacao_matriculas()
RETURNS TRIGGER AS $$
DECLARE
    id_matric INTEGER;
BEGIN

    SELECT id INTO id_matric FROM matriculas WHERE aluno_id = NEW.aluno_id AND diciplina_id = NEW.diciplina_id;

    IF id_matric IS NULL THEN

        RETURN NEW;
    
    END IF;

    RAISE EXCEPTION 'matricula invalida';
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_validacao_matriculas BEFORE INSERT ON matriculas FOR EACH ROW
EXECUTE FUNCTION validacao_matriculas();






CREATE OR REPLACE FUNCTION criacao_historico()
RETURNS TRIGGER AS $$
DECLARE
    id_matric INTEGER;
BEGIN

    INSERT INTO historico (aluno_id, diciplina_id) VALUES (NEW.aluno_id, NEW.diciplina_id);
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_criacao_historico BEFORE INSERT ON matriculas FOR EACH ROW
EXECUTE FUNCTION criacao_historico();

