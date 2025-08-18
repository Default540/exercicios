<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a9.php">
        <h1>Altura M</h1>
        <input type="number" step="0.01" name="alt" id="">
        <h1>Peso Kg</h1>
        <input type="number" step="0.01" name="peso" id="">
        <input type="submit" value="sub">
    </form>

    <?php

        $alt = floatval($_GET["alt"]);
        $peso = floatval($_GET["peso"]);

        $imc = $peso / ($alt**2);

        echo "IMC: $imc";
    ?>
</body>
</html>