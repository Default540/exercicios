<?php
    class Auth{
        
        public function verify($email, $senha) {
            if (!$email || !$senha) {
                return false;
            }
           
            $conn = new conexao();
            $conn->createConnection();

            $query = "SELECT * FROM usuarios WHERE email = :email";
            $stmt = $conn->getConnection()->prepare($query);
            $stmt->bindParam(':email', $email);

            $stmt->execute();
            $user = $stmt->fetch(PDO::FETCH_ASSOC);
            $conn->close();

            if ($user && password_verify($senha, $user['senha'])) {
                return $user;
            } else {
                return false;
            }

        }
    }
    
?>
