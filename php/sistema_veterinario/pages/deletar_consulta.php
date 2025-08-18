<?php 
    
    include 'components/header.php';

    if(!isset($_SESSION['usuario'])){
        $router->redirect('login');                            
    }

    if (!isset($_POST['idConsulta'])) {
        $router->redirect('dashboard');
    }
?>

<?php
    $consultaCRUD = new ConsultaCRUD();

    $user = $_SESSION['usuario'];

    

    $res = $consultaCRUD->delete($_POST['idConsulta']);
    if ($res) {
        $router->redirect('dashboard');
        exit();
    }else{
        echo "<p>Erro ao deletar consulta</p>";
    }
?>

