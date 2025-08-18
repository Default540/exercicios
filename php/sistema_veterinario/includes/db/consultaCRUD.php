<?php

class ConsultaCRUD{

    private $conexao;

    public function __construct() {
        $this->conexao = new Conexao();
        $this->conexao->createConnection();
    }

    public function create($usuario, $idadeAnimal, $dataConsulta, $horaConsulta, $motivo) {
        
        $sql = "INSERT INTO consultas (id_usuario, idade_animal, data_consulta, hora_consulta, motivo) VALUES (:id_usuario, :idade_animal, :data_consulta, :hora_consulta, :motivo)";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id_usuario', $usuario['id']);
        $stmt->bindParam(':idade_animal', $idadeAnimal);
        $stmt->bindParam(':data_consulta', $dataConsulta);
        $stmt->bindParam(':hora_consulta', $horaConsulta);
        $stmt->bindParam(':motivo', $motivo);
        return $stmt->execute();
    }

    public function readAll(){
        $sql = "SELECT * FROM consultas";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->execute();
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public function readAllByUser($idUsuario){
        $sql = "SELECT * FROM consultas WHERE :id_usuario = id_usuario";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id_usuario', $idUsuario);
        $stmt->execute();
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public function read($id) {
        $sql = "SELECT * FROM consultas WHERE id = :id";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        $stmt->execute();
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }

    public function update($id, $idadeAnimal = null, $dataConsulta = null, $horaConsulta = null, $motivo = null) {
        
        $consulta = $this->read($id);
        if (!$consulta) return false;
        
        $idadeAnimalFinal = $idadeAnimal ?? $consulta['idade_animal'];
        $dataConsultaFinal = $dataConsulta ?? $consulta['data_consulta'];
        $horaConsultaFinal = $horaConsulta ?? $consulta['hora_consulta'];
        $motivoFinal = $motivo ?? $consulta['motivo'];
        

        $sql = "UPDATE consultas SET idade_animal = :idade_animal, data_consulta = :data_consulta, hora_consulta = :hora_consulta, motivo = :motivo WHERE id = :id";



        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        $stmt->bindParam(':idade_animal', $idadeAnimalFinal);
        $stmt->bindParam(':data_consulta', $dataConsultaFinal);
        $stmt->bindParam(':hora_consulta', $horaConsultaFinal);
        $stmt->bindParam(':motivo', $motivoFinal);
        return $stmt->execute();
    }

    public function delete($id) {
        $sql = "DELETE FROM consultas WHERE id = :id";
        $stmt = $this->conexao->getConnection()->prepare($sql);
        $stmt->bindParam(':id', $id);
        return $stmt->execute();
    }

}