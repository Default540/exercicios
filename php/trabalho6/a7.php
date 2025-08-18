<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a7.php" method="get">
        <input type="number" name="v1" id=""><input type="number" name="v2" id=""><input type="number" name="v3" id="">
        <input type="submit" name="sub">
    </form>

    <?php 
        $v = array();

        if ($_GET["v1"] != null && $_GET["v2"] != null && $_GET["v3"] != null) {
            $v[] = intval($_GET["v1"]);
            $v[] = intval($_GET["v2"]);
            $v[] = intval($_GET["v3"]);
    
            rsort($v);
    
            for ($i=0; $i < count($v); $i++) { 
                echo $v[$i]." ";
            }
        }
            
    ?>
</body>
</html>