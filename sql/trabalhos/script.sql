CREATE DATABASE amigosecreto;

--\c amigosecreto;

CREATE TABLE evento (
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    data_hora TIMESTAMP NOT NULL
);

CREATE TABLE participante(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    data_nasc DATE NOT NULL,
    id_amigo INTEGER REFERENCES participante(id),
    id_evento INTEGER REFERENCES evento(id) NOT NULL
);

CREATE TABLE desejos(
    id SERIAL PRIMARY KEY,
    descricao TEXT NOT NULL,
    id_participante INTEGER REFERENCES participante(id) NOT NULL
);

-------------------------------------------
INSERT INTO evento (nome, data_hora) VALUES ('evento 1', '2025-01-01 10:10:10');
INSERT INTO evento (nome, data_hora) VALUES ('evento 1', '2025-01-02 10:10:10');

INSERT INTO evento (nome, data_hora) VALUES ('evento 2', '2026-01-01 10:10:10');


INSERT INTO evento (nome, data_hora) VALUES ('evento 1', '2025-05-01 10:10:10');
INSERT INTO evento (nome, data_hora) VALUES ('evento 2', '2026-05-01 10:10:10');
---------------------------------------------


INSERT INTO participante (nome, data_nasc, id_amigo, id_evento) VALUES ('participante 1', '2000-10-20', NULL,1);
INSERT INTO participante (nome, data_nasc, id_amigo, id_evento) VALUES ('participante 2', '1997-6-22', 1, 1);

UPDATE participante SET id_amigo = 2  WHERE id = 1;
--------------------------------------------

INSERT INTO participante (nome, data_nasc, id_amigo, id_evento) VALUES ('igor', '1987-01-20', NULL,1);
INSERT INTO participante (nome, data_nasc, id_amigo, id_evento) VALUES ('joao santos', '2005-2-9', 3, 1);

UPDATE participante SET id_amigo = 4  WHERE nome = 'igor';



SELECT * FROM evento WHERE EXTRACT(YEAR from data_hora) =  2025 AND EXTRACT(MONTH from data_hora) =  1;


SELECT * FROM participante WHERE EXTRACT(YEAR FROM (data_nasc - NOW())) = 18; 


SELECT * FROM participante WHERE nome LIKE 'i%';




