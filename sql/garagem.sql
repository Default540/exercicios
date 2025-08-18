
CREATE DATABASE garagem;
--\c garagem

CREATE TABLE Cliente (
    id SERIAL PRIMARY KEY,
    cpf CHARACTER(11) UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    data_nascimento DATE NOT NULL
);

CREATE TABLE Endereco(
    id SERIAL PRIMARY KEY,
    rua TEXT NOT NULL,
    bairro TEXT NOT NULL,
    complemento TEXT,
    numero VARCHAR(10),
    pk_cliente INTEGER,
    FOREIGN KEY (pk_cliente) REFERENCES Cliente (id)
);

CREATE TABLE Modelo(
    id SERIAL PRIMARY KEY,
    descricao TEXT,
    ano_de_lancamento CHARACTER(4)
);

CREATE TABLE Veiculo(
    id SERIAL PRIMARY KEY,
    chassi TEXT UNIQUE NOT NULL,
    placa TEXT UNIQUE NOT NULL,
    cor TEXT NOT NULL,
    ano CHARACTER(4) NOT NULL,
    modelo INTEGER,
    pk_dono INTEGER,
    FOREIGN KEY (modelo) REFERENCES Modelo(id),
    FOREIGN KEY (pk_dono) REFERENCES Cliente (id)
);


CREATE TABLE Andar(
    id SERIAL PRIMARY KEY,
    andar TEXT NOT NULL
);

CREATE TABLE Vaga(
    id SERIAL PRIMARY KEY,
    
    andar_id INTEGER,
    FOREIGN KEY (andar_id) REFERENCES Andar(id),

    pk_cliente INTEGER,
    FOREIGN KEY (pk_cliente) REFERENCES Cliente (id)
);

CREATE TABLE vaga_veiculo(
    
    id_veiculo INTEGER,
    FOREIGN KEY (id_veiculo) REFERENCES Veiculo(id),
    
    pk_cliente INTEGER,
    FOREIGN KEY (pk_cliente) REFERENCES Cliente (id),
    
    id_vaga INTEGER,
    FOREIGN KEY (id_vaga) REFERENCES Vaga(id),
    
    dataHora_inicial TIMESTAMP NOT NULL,
    dataHora_final TIMESTAMP,
    valor_pago DECIMAL(10,2),
    
    PRIMARY KEY (id_vaga, dataHora_inicial)
);

---------------------------------------------------------------------------------------

INSERT INTO cliente (cpf, nome, data_nascimento) VALUES ('11111111111','Joao vitor santos','2005-02-05');
INSERT INTO Cliente (cpf, nome, data_nascimento) VALUES ('12345678911','Lucas xxxx','2000-03-12');
INSERT INTO Cliente (cpf, nome, data_nascimento) VALUES ('12345621901','Felipe xxx','1994-02-25');

INSERT INTO Endereco (rua, bairro, complemento, numero, pk_cliente) VALUES ('rua1','bairro1','complemento','123B',1);
INSERT INTO Endereco (rua, bairro, complemento, numero, pk_cliente) VALUES ('rua1','bairro1',NULL,'123A',1);
INSERT INTO Endereco (rua, bairro, complemento, numero, pk_cliente) VALUES ('rua2','bairro1','complemento','122',2);
INSERT INTO Endereco (rua, bairro, complemento, numero, pk_cliente) VALUES ('rua3','bairro2','complemento','545',3);

INSERT INTO Modelo (descricao, ano_de_lancamento) VALUES ('Descrição modelo', '2000');
INSERT INTO Modelo (descricao, ano_de_lancamento) VALUES ('Descrição modelo 2', '2002');

INSERT INTO Veiculo (chassi, placa, cor, ano, modelo, pk_dono) VALUES ('df45hd36dy3dsefgw','AF36FAS','Branco','2000',1,1);
INSERT INTO Veiculo (chassi, placa, cor, ano, modelo, pk_dono) VALUES ('df45hd36dy38sefgw','AL36FAS','Preto','2000',2,1);
INSERT INTO Veiculo (chassi, placa, cor, ano, modelo, pk_dono) VALUES ('df45hd83dy3dsefgw','AB36FAS','Azul','2000',1,2);
INSERT INTO Veiculo (chassi, placa, cor, ano, modelo, pk_dono) VALUES ('df45hdz6dy3ds0fgw','AT36FAS','Cinza','2000',2,3);

INSERT INTO Andar (andar) VALUES ('1A');
INSERT INTO Andar (andar) VALUES ('1B');
INSERT INTO Andar (andar) VALUES ('2A');
INSERT INTO Andar (andar) VALUES ('2B');

INSERT INTO Vaga (andar_id) VALUES (1);
INSERT INTO Vaga (andar_id) VALUES (1);
INSERT INTO Vaga (andar_id) VALUES (2);
INSERT INTO Vaga (andar_id) VALUES (3);
INSERT INTO Vaga (andar_id) VALUES (4);
INSERT INTO Vaga (andar_id) VALUES (4);

--(dataHora_inicial) GETDATE()
INSERT INTO vaga_veiculo (id_veiculo, id_vaga, dataHora_inicial, dataHora_final, valor_pago) VALUES (1, 2,'2024-07-10 10:30:14', '2024-07-12 15:20:18', 20.50); 
INSERT INTO vaga_veiculo (id_veiculo, id_vaga, dataHora_inicial, dataHora_final, valor_pago) VALUES (2, 1,'2024-07-10 10:30:14', '2024-07-12 15:20:18', 20.50);
INSERT INTO vaga_veiculo (id_veiculo, id_vaga, dataHora_inicial, dataHora_final, valor_pago) VALUES (3, 4,'2024-07-10 10:30:14', '2024-07-12 15:20:18', 20.50);
INSERT INTO vaga_veiculo (id_veiculo, id_vaga, dataHora_inicial, dataHora_final, valor_pago) VALUES (4, 3,'2024-07-10 10:30:14', '2024-07-12 15:20:18', 20.50);

------------------------------------------------------------

SELECT placa, ano FROM Veiculo WHERE placa = 'AB38FAS';


SELECT placa, ano FROM Veiculo WHERE CAST(ano AS INTEGER) >= 2000;

SELECT Veiculo.* FROM Veiculo INNER JOIN Modelo ON Veiculo.modelo = Modelo.id AND Modelo.id = 1;

SELECT * FROM vaga_veiculo WHERE id_veiculo = 1;

SELECT justify_days(dataHora_inicial-dataHora_final) FROM vaga_veiculo WHERE id_veiculo = 1 AND dataHora_inicial = '2024-07-10 10:30:14';

SELECT COUNT(modelo) FROM Veiculo WHERE modelo = 1; 

--SELECT SUM(FLOOR(DATEDIFF(data_nascimento, GETDATE())/ 365.25))/COUNT(id) FROM Cliente;

--SELECT id_veiculo, DATEDIFF(HOUR, dataHora_inicial, dataHora_final)*2 FROM vaga_veiculo;