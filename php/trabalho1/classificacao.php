<?php

$idade = 10;

if ($idade < 13) {
    echo "Criança";
}else if ($idade <= 19) {
    echo "Adolecente";
}else if ($idade <= 60) {
    echo "Adulto";
}else {
    echo "Idoso";
}