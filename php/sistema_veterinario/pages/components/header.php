<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body class="d-flex flex-column min-vh-100">
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="/">Minha Marca</a>
                
                </button>
                
                    <?php

                        include_once __DIR__ . '/../../includes/include.php';
                        $router = new Router();

                        if (isset($_SESSION['usuario'])) {
                            $usuario = $_SESSION['usuario'];
                            
                            echo "
                                <form class='d-flex ' action='/pages/logout.php'>
                                    <p class='text-light m-auto'>{$usuario['nome']}</p>
                                    <button class='btn btn-outline-light m-2' type='submit'>Logout</button>    
                                </form>
                            ";
                        }

                        
                    ?>
                    
                </div>
            </div>
        </nav> 
    </header>
    <main class="container flex-fill mt-4 mb-4">