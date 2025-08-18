<?php

$notas = [2, 5, 6];
$soma = 0;

for ($i=0; $i < count($notas); $i++) { 
    $soma += $notas[$i];
}

$media = $soma/count($notas);

if ($media >= 6) {
    echo "O aluno passou com media $media";
}else{
    echo "O aluno foi reprovado com media $media";
}