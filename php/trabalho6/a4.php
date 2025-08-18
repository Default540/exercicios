<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a4.php" method="get">

        <h1>Quantos pacientes?</h1>
        <input type="number" name="quant" id="">

        <input type="submit" value="submit">

        
    </form>

    
    <form action="./a4.php" method="post">
        <?php

        $quant = $_GET["quant"];
        
        if ($quant > 0) {
            echo "Coloque a idade dos pacientes";
            for ($i=1; $i <= $quant; $i++) { 
                
                echo '<input type="number" name="v'.$i.'"><br>';
                echo '<input type="hidden" name="quant" value="'.$quant.'">';
            }
            echo '<input type="submit" value="sub"><br>';
        }

        ?>
    </form>
    

    <?php 

        $quant = $_POST["quant"];
        
        $idadeMedia = 0;
        
        $quantCrianca = 0;
        $quantAdolecente = 0;
        $quantAdulto = 0;
        $quantIdoso = 0;

        for ($i=1; $i <= $quant; $i++) { 
            
            $idade = $_POST["v".$i];

            $idadeMedia += $idade;

            if ($idade < 14) {
                $quantCrianca++;
            }elseif ($idade < 19) {
                $quantAdolecente++;
            }elseif ($idade < 60) {
                $quantAdulto++;
            }else{
                $quantIdoso++;
            }
        }

        echo "Total de pessoas: ".$quant." 100%<br>"; 
        
        echo "Criança: ".$quantCrianca." ".($quantCrianca/$quant*100)."%<br>";
        echo "Adolecente: ".$quantAdolecente." ".($quantAdolecente/$quant*100)."%<br>";
        echo "Adulto: ".$quantAdulto." ".($quantAdulto/$quant*100)."%<br>";
        echo "Idoso: ".$quantIdoso." ".($quantIdoso/$quant*100)."%<br>";
        
    ?>
</body>
</html>