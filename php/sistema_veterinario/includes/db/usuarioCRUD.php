<?php

class UsuarioCRUD{

    private $conexao;

    public function __construct() {
        $this->conexao = new Conexao();
        $this->conexao->createConnection();
    }

    public function create($nome, $email, $senha) {
        $senhaCriptografada = password_hash($senha, PASSWORD_DEFAULT);
        $sql = "INSERT INTO usuarios (nome, email, senha) VALUES (:nome, :email, :senha)";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':nome', $nome);
        $stmt->bindParam(':email', $email);
        $stmt->bindParam(':senha', $senhaCriptografada);
        return $stmt->execute();
    }

    public function readAll() {
        $sql = "SELECT * FROM usuarios";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->execute();
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }

    public function read($id) {
        $sql = "SELECT * FROM usuarios WHERE id = :id";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        $stmt->execute();
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }

    public function update($id, $nome = null, $email = null, $senha = null) {
        
        $user = $this->read($id);

        if (!$user) return false;
        
        
        $nomeFinal = $user['nome'];
        $emailFinal = $user['email'];
        $senhaFinal = $user['senha'];

        if ($nome) $nomeFinal = $nome;
        
        if ($email) $emailFinal = $email;
        
        if ($senha) $senhaFinal = password_hash($senha, PASSWORD_DEFAULT);
        

        $sql = "UPDATE usuarios SET nome = :nome, email = :email, senha = :senha WHERE id = :id";



        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        $stmt->bindParam(':nome', $nomeFinal);
        $stmt->bindParam(':email', $emailFinal);
        $stmt->bindParam(':senha', $senhaFinal);


        return $stmt->execute();
    }

    public function delete($id) {
        $sql = "DELETE FROM usuarios WHERE id = :id";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        return $stmt->execute();
    }

}