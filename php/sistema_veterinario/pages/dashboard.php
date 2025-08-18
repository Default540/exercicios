<?php 
    
    include 'components/header.php';

    if(!isset($_SESSION['usuario'])){
        $router->redirect('login');                            
    }
?>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Idade do animal</th>
      <th scope="col">Data da consulta</th>
      <th scope="col">Hora da consulta</th>
      <th scope="col">Motivo</th>
      <th scope="col">Data Agendamento</th>
      <th scope="col">Editar</th>
      <th scope="col">Deletar</th>
    </tr>
  </thead>
  <tbody>
    
    <?php
      $user = $_SESSION['usuario'];
      $consultaCRUD = new ConsultaCRUD();
      $consultas = $consultaCRUD->readAll();
      
      foreach ($consultas as $key => $value) {
        $res = "
        
          <tr>
            <td>{$value['idade_animal']}</td>
            <td>{$value['data_consulta']}</td>
            <td>{$value['hora_consulta']}</td>
            <td>{$value['motivo']}</td>
            <td>{$value['data_agendamento']}</td>
            
          ";
        

        if ($user['id'] == $value['id_usuario']) {
          $res = $res."
            <td>
              <form action='/pages/editar_consulta.php' method='post'><input type='hidden' name='idConsulta' value='{$value['id']}'><button class='btn btn-outline-warning' type='submit'>Editar</button></form></td>
            <td>
              <form action='/pages/deletar_consulta.php' method='post'><input type='hidden' name='idConsulta' value='{$value['id']}'><button class='btn btn-outline-danger' type='submit'>Excluir</button></form></td>";
        }else{
            $res = $res."<td><button type='button' class='btn btn-outline-secondary' disabled>Editar</button></td>
              <td><button type='button' class='btn btn-outline-secondary' disabled>Excluir</button></td>
            ";
        }


        $res = $res."</tr>";

        echo $res;
      }
    ?>
    
  </tbody>
</table>

<?php include_once 'components/footer.php'?>
