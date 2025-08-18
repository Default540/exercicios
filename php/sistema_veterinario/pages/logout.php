<?php

include_once "../includes/router/router.php";

session_start();
session_unset();
session_destroy();


$router = new Router();

$router->redirect("index");

exit();