<?php 
    
    include 'pages/components/header.php';

    if(!isset($_SESSION['usuario'])){
        $router->redirect('login');                            
    }
?>

<div class="flex">
    <div><a href="/pages/dashboard.php">dashboard</a></div>
    <div><a href="/pages/nova_consulta.php">nova consulta</a></div>
</div>

<?php include_once 'pages/components/footer.php'?>
