<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a1.php" method="get">
        <h1>v1 </h1><input type="number" name="v1" id="v1"><br>
        <select name="operacao" id="operacao">
            <option value="soma">Soma</option>
            <option value="subtracao">subtracao</option>
            <option value="divisao">Divisao</option>
            <option value="multiplicacao">multiplicacao</option>
            <option value="potencializacao">potencializacao</option>
        </select>
        <h1>v2 </h1><input type="number" name="v2" id="v2">
        <input type="submit" value="sub">
    </form>

    <?php

    $v1 = $_GET["v1"];
    $v2 = $_GET["v2"];

    $opcao = $_GET["operacao"];

    if ($opcao == "soma") {
        echo $v1+$v2;    
    }elseif ($opcao == "subtracao") {
        echo $v1-$v2;
    }elseif ($opcao == "divisao") {
        echo $v1/$v2;
    }elseif ($opcao == "multiplicacao") {
        echo $v1*$v2;;
    }elseif ($opcao == "potencializacao") {
        echo $v1**$v2;;
    }
?>
</body>
</html>
