<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a6.php" method="get">
        <h1>Qual o valor?</h1>
        <input type="number" name="v" id="">
        <input type="submit" value="">
    </form>
    <?php 
        $valor = $_GET["v"];

        if ($valor != null) {
            if ($valor % 10 == 0) {
                echo "o valor é divisivel por 10<br>";
            }
    
            if ($valor % 5 == 0) {
                echo "o valor é divisivel por 5<br>";
            }
    
            if ($valor % 2 == 0) {
                echo "o valor é divisivel por 2<br>";
            }
    
            if ($valor % 10 != 0 && $valor % 5 != 0 && $valor % 2 != 0) {
                echo "o valor não é divisivel por 10, 5 e 2<br>";
            }
            
        }

    ?>
</body>
</html>