--CREATE VIEW nome as SELECT * FROM evento;

SELECT 1,2,3 EXCEPT SELECT 2,2,2;
SELECT 1,2,3 UNION SELECT 2,5,6;
SELECT 1,2,3 INTERSECT SELECT 2,2,2;
--SELECT DISTINCT
SELECT atracao.nome, evento.nome FROM evento INNER JOIN evento_atracao ON (evento_atracao.evento_id = evento.id) INNER JOIN atracao ON (atracao.id = evento_atracao.atracao_id);

SELECT evento.id, evento.nome from evento WHERE evento.id not in (SELECT evento_id FROM  evento_atracao);

SELECT * from evento LEFT JOIN evento_atracao ON (evento.id = evento_atracao.evento_id);

SELECT nome , id FROM evento UNION SELECT nome , id FROM atracao;