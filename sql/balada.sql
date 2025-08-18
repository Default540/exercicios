SELECT atracao.nome, evento.nome FROM atracao LEFT JOIN evento_atracao ON atracao.id = evento_atracao.atracao_id LEFT JOIN evento ON evento.id = evento_atracao.evento_id;

SELECT funcionario.nome, evento.nome FROM funcionario INNER JOIN evento_funcionario ON (funcionario.id = evento_funcionario.funcionario_id) INNER JOIN evento ON (evento.id = evento_funcionario.evento_id) WHERE evento.nome LIKE 'H%';

SELECT evento.nome FROM evento LEFT JOIN evento_funcionario ON (evento.id = evento_funcionario.evento_id) WHERE evento_funcionario.evento_id IS NULL;