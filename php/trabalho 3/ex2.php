<?php

$v = [];


if ($_GET["nota1"] == null || $_GET["nota2"] == null || $_GET["nota3"] == null) {
    $v = [5,5,5];    
}else{
    $v = [$_GET["nota1"],$_GET["nota2"],$_GET["nota3"]];

}

$media = 0;

for ($i=0; $i < count($v); $i++) { 
    $media+=$v[$i];
}

$media/=count($v);

echo "media: $media<br>";

if($media >= 6){
    echo "Aprovado";
}else{
    echo "Reprovado";
}