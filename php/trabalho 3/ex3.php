<?php

$v = [1,2,3,4,5];


$media = 0;

for ($i=0; $i < count($v); $i++) { 
    $media+=$v[$i];
}

$media/=count($v);

for ($i=0; $i < count($v); $i++) { 
    if ($v[$i] > $media) {
        echo "$v[$i]<br>";
    }
}