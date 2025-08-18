<?php

$valorCarro = 100;

$parcelas = [1,6,12,18,24,30,36,42,48,54,60];

$parcela = 6;

$juros = 0;

if (in_array($parcela, $parcelas)) {
    
    if ($parcela == 1) {

        $juros = -0.2;
    }else{
        $juros = $parcela/2/100;
    }

    echo "Valor final: ".$valorCarro + $valorCarro*$juros."<br>Quantidade de parcelas: $parcela<br>Valor das parcelas: ".($valorCarro + $valorCarro*$juros) /$parcela;


}