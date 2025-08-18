<?php include_once 'components/header.php'; ?>

<main>
    <form method="post">
        <div class="mb-3">
            <label for="nome" class="form-label">Nome</label>
            <input type="text" name="nome" class="form-control" id="name" aria-describedby="nome">
            <div id="nomeHelp" class="form-text">Coloque como quer ser chamado</div>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" name="email" class="form-control" id="email" aria-describedby="email">
            <div id="emailHelp" class="form-text">Coloque seu email</div>
        </div>
        <div class="mb-3">
            <label for="senha" class="form-label">Senha</label>
            <input type="password" name="senha" class="form-control" id="senha">
        </div>
        <button type="submit" class="btn btn-primary">Criar conta</button>
    </form>
 

    <?php

        $router = new Router();

        if (isset($_SESSION['usuario'])) {
            $router->redirect('/');
            exit();
        }
        if (isset($_POST['email']) && isset($_POST['nome']) && isset($_POST['senha'])) {
            $userCRUD = new UsuarioCRUD();

            $res = $userCRUD->create($_POST['nome'], $_POST['email'], $_POST['senha']);

            if ($res) {
                session_start();
                $_SESSION['usuario'] = (new Auth())->verify($_POST['email'], $_POST['senha']);
                $router->redirect('dashboard');                
                exit();
            }else{
                echo "<p>Erro ao criar usuario</p>";
            }
        }
    ?>

</main>


<?php include_once 'components/footer.php'; ?>