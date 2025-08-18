<?php

$n = 4;
$res = 1;

for ($i=1; $i <= $n; $i++) { 
    $res *= $i;
}

if ($n == 0) {
    $res = 1;
}


echo $res;