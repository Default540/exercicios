<?php

$lucro = -200;

$ingressosVendidos = 120-26;

$lucroMaximo = [0,0,0];

for ($i=5; $i >= 0 ; $i -= 0.5) { 

    
    $ingressosVendidos += 26;
    $lucro += ($ingressosVendidos*$i);

    echo "Preco: $i, Ingressos vendidos: $ingressosVendidos, Lucro: $lucro<br>";


    if ($lucro > $lucroMaximo[2]) {
        $lucroMaximo[0] = $i;
        $lucroMaximo[1] = $ingressosVendidos;
        $lucroMaximo[2] = $lucro;
    }

    $lucro = -200;
}


echo "<br><br>O lucro maximo é de $lucroMaximo[2] vendendo o ingresso a $lucroMaximo[0] e vendendo $lucroMaximo[1] ingressos";