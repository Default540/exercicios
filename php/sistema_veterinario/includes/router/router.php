<?php

class Router{
    private $routers = [];

    public function __construct($routers = null) {
        if (!$routers) {
            $routers = include $_SERVER['DOCUMENT_ROOT']."/config/routers.php";
        }

        $this->routers = $routers;
    }

    public function redirect($namePath){
        $path = $this->routers[$namePath];
        var_dump($path);
        header("Location: ".$path);
    }

    public function include($namePath){
        $path = $this->routers[$namePath];
        include_once $path;
    }
}