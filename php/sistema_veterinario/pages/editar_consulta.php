<?php 
    
    include 'components/header.php';

    if(!isset($_SESSION['usuario'])){
        $router->redirect('login');                            
    }

    if (!isset($_POST['idConsulta'])) {

        $router->redirect('/');
    }
?>

<form method="post">
    
    <input type="number" name="idadeAnimal" id="" required>
    <input type="datetime-local"  name="dataHoraConsulta" required>
    <input type="text" name="motivo" minlength="10" id="">
    <input type="hidden" name="idConsulta" value="<?php echo $_POST['idConsulta'] ?>">
    <button type="submit">Salvar</button>
</form>

<?php
    if (isset($_POST['idadeAnimal']) && isset($_POST['dataHoraConsulta']) && isset($_POST['motivo'])) {
        $consultaCRUD = new ConsultaCRUD();

        $user = $_SESSION['usuario'];

        $dataHora = $_POST['dataHoraConsulta'];

        $timestamp = strtotime($dataHora);
        $agora = time();

        
        if ($timestamp <= $agora) {
            echo "A data e hora da consulta devem ser futuras.";
            exit;
        }

       
        $diaSemana = date('w', $timestamp);
        if ($diaSemana == 0 || $diaSemana == 6) {
            echo "Consultas não podem ser agendadas em fins de semana.";
            exit;
        }

        $hora = date('H:i', $timestamp);
        if ($hora < '08:00' || $hora > '18:00') {
            echo "Consultas devem ser entre 08:00 e 18:00.";
            exit;
        }

        $res = $consultaCRUD->update($_POST['idConsulta'], $_POST['idadeAnimal'], (new DateTime($dataHora))->format('Y-m-d'), (new DateTime($dataHora))->format('H:i'), $_POST['motivo']);
        if ($res) {
            $router->redirect('dashboard');
            exit();
        }else{
            echo "<p>Erro ao salvar as mudanças</p>";
        }
        
    }
?>


<?php include_once 'components/footer.php'?>
