<?php

$valor = 500;
$renda = 2500;
$parcelas = 5;

if ($valor <= $renda*0.3 && $parcelas <= 180) {
    echo $valor/$parcelas;
}else{
    echo "Financiamento não foi aprovado";
}