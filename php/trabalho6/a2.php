<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a2.php">
        <h1>Coloque sua idada</h1>
        <input type="number" name="idade" id="idade">
        <input type="submit" value="submit">
    </form>

    <?php

        $idade = $_GET["idade"];
    
        if ($idade < 13) {
            echo "criança";
        }elseif ($idade <= 19) {
            echo "adolecente";
        }elseif ($idade <= 60) {
            echo "adulto";
        }else{
            echo "idoso";
        }
        
    ?>
</body>
</html>