<?php

$temperaturaTanque = -600;

if ($temperaturaTanque >= 0 && $temperaturaTanque <= 300) {
    echo "Normal";
}else {
    echo "Alerta";
}