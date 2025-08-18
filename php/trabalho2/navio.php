<?php

$pontoInicial = 10;
$pontoFinal = 23;
$velocidadeKmH = 5;

$distanciaKm = ($pontoFinal - $pontoInicial) * 111;


$tempoViagemHs = $distanciaKm/$velocidadeKmH;

$diasDeViagem = $tempoViagemHs/24;


echo "Dias de viagem: $diasDeViagem. Distancia Percorrida: $distanciaKm Km";