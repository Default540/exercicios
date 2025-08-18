<?php

$v = [10,20,15,5,1,2,3,4,6,7,8,9,19,18,17,16,11,12,13,14];

$maior = 0;
$menor = 100;
$percent = 0;
$media = 0;


for ($i=0; $i < count($v); $i++) { 
    if ($v[$i] > $maior) $maior = $v[$i];
    if ($v[$i] < $menor) $menor = $v[$i];
    if($v[$i] % 2 == 0) $percent++;
    $media += $v[$i];
}

$percent = $percent / count($v) * 100;
$media = $media / count($v);

echo "maior: $maior<br>menor: $menor<br>percentual numeros pares: $percent%<br>Media: $media";