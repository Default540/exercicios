DROP DATABASE IF EXISTS clinica;
CREATE DATABASE clinica;

\c clinica;

CREATE TABLE medicos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(50) NOT NULL,
    crm VARCHAR(5) UNIQUE NOT NULL
);

INSERT INTO medicos (nome, especialidade, crm) VALUES ('medico1', 'especialidade1','1d3fd');

CREATE TABLE pacientes(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    telefone VARCHAR(20)
);

INSERT INTO pacientes (nome, data_nascimento, cpf, telefone) VALUES ('paciente1', '2000-10-10', '12345678912','99999999');

CREATE TABLE exames(
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    data_hora_realizacao TIMESTAMP NOT NULL,
    resultado TEXT,
    consulta_id INTEGER
);

CREATE TABLE consultas(
    id SERIAL PRIMARY KEY,
    status VARCHAR(20) NOT NULL CHECK (status IN ('Agendada', 'Realizada', 'Cancelada')),
    data_hora TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    diagnostico TEXT,
    medico_id INTEGER REFERENCES medicos(id),
    paciente_id INTEGER REFERENCES pacientes(id)
);


CREATE OR REPLACE FUNCTION registrar_consulta(medico_id_aux INTEGER, paciente_id_aux INTEGER, data_hora_aux TIMESTAMP) RETURNS INTEGER AS
$$

DECLARE

    medico_reg RECORD;
    paciente_reg RECORD;
    res integer;
BEGIN

    SELECT * INTO medico_reg FROM medicos WHERE id = medico_id_aux;
    SELECT * INTO paciente_reg FROM pacientes WHERE id = paciente_id_aux;

    IF NOT FOUND medico_reg THEN
        RAISE EXCEPTION 'Medico % não encontrado', medico_id_aux;
    END IF;

    IF NOT FOUND paciente_reg THEN
        RAISE EXCEPTION 'Paciente % não encontrado', paciente_id_aux;
    END IF;

    INSERT INTO consultas (status, data_hora, diagnostico, medico_id, paciente_id) VALUES ('Agendada', data_hora_aux ,NULL,medico_id_aux, paciente_id_aux);
    
    SELECT id into res FROM consultas WHERE status = 'Agendada' AND medico_id = medico_id_aux AND data_hora = data_hora_aux;

    RETURN res;
END
---
$$ LANGUAGE 'plpgsql';

SELECT registrar_consulta(1::INTEGER, 1::INTEGER, '2000-10-10'::TIMESTAMP);



CREATE OR REPLACE PROCEDURE atualizar_consultas_pendentes() AS
$$
SELECT * ----------- 
$$ LANGUAGE 'plpgsql';


CREATE OR REPLACE FUNCTION listar_exames_por_paciente(paciente_id_aux INTEGER) INTEGER AS
$$

DECLARE

        res RECORD[];

BEGIN

    SELECT * INTO res FROM exames WHERE paciente_id = paci0ente_id_aux;

    RETURN res;
    
END
---
$$ LANGUAGE 'plpgsql';


CREATE OR REPLACE FUNCTION verificar_disponibilidade_medico(medico_id_aux INTEGER) INTEGER AS
$$

DECLARE

BEGIN

    SELECT * INTO res FROM exames WHERE paciente_id = paci0ente_id_aux;

    RETURN res;
    
END
---
$$ LANGUAGE 'plpgsql';