select id, nome, to_char(data_nascimento, 'dd/mm/yyyy') from funcionario;
select *, extract(year from age(data_nascimento)) from funcionario;


-------------
--dt_nasc e idade aparecem no head da tabela
select id, nome, to_char(data_nascimento, 'dd/mm/yyyy') as dt_nasc, extract(year from age(data_nascimento)) as idade,
case
    when extract(dow from data_nascimento) = 0 then 'domingo'
    when extract(dow from data_nascimento) = 1 then 'segunda'
    when extract(dow from data_nascimento) = 2 then 'terça'
    when extract(dow from data_nascimento) = 3 then 'quarta'
    when extract(dow from data_nascimento) = 4 then 'quinta'
    when extract(dow from data_nascimento) = 5 then 'sexta'
    when extract(dow from data_nascimento) = 6 then 'sabado'
end as dia_semana
from funcionario;
----------------