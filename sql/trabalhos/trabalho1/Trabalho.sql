DROP DATABASE IF EXISTS portal;

CREATE DATABASE portal;

\c portal;

CREATE SCHEMA sistema_artigos;

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    email CHARACTER varying(200) UNIQUE NOT NULL,
    nome CHARACTER varying(200) NOT NULL,
    senha CHARACTER varying(200) NOT NULL,
    data_cadastro DATE DEFAULT CURRENT_DATE NOT NULL,
    data_nascimento TIMESTAMP NOT NULL,
    telefones TEXT[] NOT NULL
);

CREATE TABLE endereco(
    id SERIAL PRIMARY KEY,
    bairro TEXT NOT NULL,
    complemento TEXT NOT NULL,
    nro TEXT NOT NULL,
    cep TEXT NOT NULL UNIQUE,
    rua TEXT NOT NULL,
    usuario_id INTEGER REFERENCES usuario(id) NOT NULL
);



CREATE TABLE sistema_artigos.categoria(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL
);

CREATE Table sistema_artigos.artigo(
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    data_hora_publicacao TIMESTAMP NOT NULL,
    usuario_id INTEGER REFERENCES usuario(id) NOT NULL,
    categoria_id INTEGER REFERENCES sistema_artigos.categoria (id) NOT NULL
);

CREATE TABLE sistema_artigos.comentario(
    id SERIAL PRIMARY KEY,
    conteudo TEXT NOT NULL,
    data_hora_comentario TIMESTAMP NOT NULL,
    usuario_id INTEGER REFERENCES usuario(id) NOT NULL,
    artigo_id INTEGER REFERENCES sistema_artigos.artigo(id) NOT NULL
);


CREATE TABLE sistema_artigos.curtida(
    data_hora_curtida TIMESTAMP NOT NULL,
    usuario_id INTEGER REFERENCES usuario(id) NOT NULL,
    artigo_id INTEGER REFERENCES sistema_artigos.artigo(id) NOT NULL,
    PRIMARY KEY (usuario_id, artigo_id)
);

INSERT INTO usuario (email, nome, senha, data_nascimento, telefones) VALUES 
('awd@email.com', 'nome1', '1234', '03/04/2000', ARRAY ['131414','1314153']), 
('dddd@email.com', 'nome2', '98765', '13/05/2004', ARRAY ['1324214','1313353']), 
('dehe@email.com', 'nome3', '4242', '20/10/2002', ARRAY ['58524214','85353']),
('awdff@email.com', 'nome4', '12325', '13/06/2011', ARRAY ['141535651','13141151']);

 

INSERT INTO endereco (bairro, complemento, nro, cep, rua, usuario_id) VALUES 
('bairro1', 'complemento1', '14A', '13441','Rua1',1),
('bairro2', 'complemento2', '15B', '132551','Rua2',1),
('bairro3', 'complemento3', '16', '1346471','Rua3',2),
('bairro4', 'complemento4', '16', '134624','Rua4',3);

INSERT INTO sistema_artigos.categoria (nome) VALUES ('esporte'), ('noticia do dia');

INSERT INTO sistema_artigos.artigo(titulo, data_hora_publicacao, usuario_id, categoria_id) VALUES
('titulo1','10/10/2012',1,1),
('titulo2','11/09/2014',1,2),
('titulo3','10/10/2012',2,1),
('titulo4','10/10/2020',2,2),
('titulo5','01/12/2016',3,1);

INSERT INTO sistema_artigos.comentario(conteudo, data_hora_comentario, artigo_id, usuario_id) VALUES
('conteudo1','09/10/2023', 1, 1),
('conteudo2','03/11/2020', 1, 1),
('conteudo3','25/05/2013', 2, 2),
('conteudo4','22/02/2021', 2, 3);

INSERT INTO sistema_artigos.curtida (data_hora_curtida, artigo_id, usuario_id) VALUES 
('10/10/2010', 1, 1),
('10/10/2010', 1, 2),
('10/10/2010', 2, 1),
('10/10/2010', 2, 2),
('10/10/2010', 2, 3);



SELECT usuario.*, count(artigo) as quandidade                                                            --seleciona a quantidade de artigos e o usuario
FROM usuario INNER JOIN sistema_artigos.artigo on artigo.usuario_id = usuario.id                                         --inner join onde o id do usuario é igual ao usuario que escreveu a materia
GROUP BY usuario.id                                                                                      --agrupa pelo usuario 
HAVING count(artigo) = (SELECT count(*) FROM sistema_artigos.artigo GROUP BY usuario_id ORDER BY count(*) DESC LIMIT 1)  --verifica se a quantidade de artigos é igual a maior quantidade de artigos de um usuario
ORDER BY usuario.id;                                                                                     --ordena pelo id do usuario

SELECT artigo.titulo as titulo_do_artigo, usuario.nome as autor_do_artigo FROM sistema_artigos.artigo LEFT JOIN usuario ON artigo.usuario_id = usuario.id;

SELECT usuario.nome,  CASE 
    WHEN endereco.cep IS NULL THEN  'endereco não cadastrado'
    ELSE  endereco.cep
END FROM usuario LEFT JOIN endereco on usuario.id = endereco.usuario_id;

CREATE VIEW usuario_artigo as SELECT usuario.nome, artigo.titulo FROM usuario LEFT JOIN sistema_artigos.artigo on artigo.usuario_id = usuario.id;