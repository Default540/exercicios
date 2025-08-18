
<?php 
    include './components/header.php'; 
?>


<form method="post">
    <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" name="email" id="email" class="form-control" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="senha" class="form-label">Password</label>
        <input type="password" name="senha" id="senha" class="form-control" id="exampleInputPassword1">
    </div>
    <a href="/pages/cadastro.php" class="link-primary link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">Criar conta</a>
    <br>
    <button type="submit" class="btn btn-primary mt-2">Login</button>
</form>
<?php

    if (isset($_SESSION['usuario'])) {
        $router->redirect('index');
        exit();
    }

    if (isset($_POST['email']) && isset($_POST['senha'])) {

        include_once '../includes/auth/auth.php';

        $auth = new Auth();
        $user = $auth->verify($_POST['email'], $_POST['senha']);

        if ($user) {
            session_start();
            $_SESSION['usuario'] = $user;
            $router->redirect("index");
            exit();
        }else{
            echo "<p>Usuário ou senha inválidos.</p>";
        }
        
    }
?>

<?php include_once './components/footer.php'; ?>