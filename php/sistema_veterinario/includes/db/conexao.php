<?php 

class conexao{
    private $host;
    private $db;
    private $dbname;
    private $user;
    private $pass;
    private $port;
    private $conection;
    
    public function __construct($dbConf = null) {

        if (!$dbConf) {
            $dbConf = include '../config/database.php';
        }

        $this->host = $dbConf['host'];
        $this->db = $dbConf['db'];
        $this->dbname = $dbConf['dbname'];
        $this->user = $dbConf['username'];
        $this->pass = $dbConf['password'];
        $this->port = $dbConf['port'];
    }

    public function createConnection(){
        
        $dsn = "{$this->db}:host={$this->host};dbname={$this->dbname};port={$this->port};";

        try {
            $pdo = new PDO($dsn, $this->user, $this->pass);
            $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            $this->conection = $pdo;
        } catch (PDOException $e) {
            echo 'Erro: ' . $e->getMessage();
            return null;
        }
    }

    public function getConnection() {
        return $this->conection;
    }

    public function close(){
        $this->conection = null;
    }
}