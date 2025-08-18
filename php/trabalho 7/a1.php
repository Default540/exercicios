<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action="./a1.php" method="get">
        
        <span>nome:</span>
        <br>
        <input type="text" name="nome" id="nome">
        <br><br>

        <span>email:</span>
        <br>
        <input type="email" name="email" id="email">
        <br><br>
        
        <span>sexo:</span>
        <br>
        <span>masculino</span>
        <input type="radio" name="sexo" checked value="masc" id="masc">
        <span>feminino</span>
        <input type="radio" name="sexo" value="fem" id="fem">
        <br><br>
        
        <span>endereço:</span>
        <br>
        <input type="text" name="endereco" id="endereco">
        <br><br>

        <span>numero:</span>
        <br>
        <input type="number" name="numero" id="numero">
        <br><br>
        
        <span>cidade:</span>
        <br>
        <input type="text" name="cidade" id="cidade">
        <br><br>

        <span>estado:</span>
        <br>
        <select name="estado" id="estado">
            <option value="">Selecione um estado</option>
            <option value="AC">Acre</option>
            <option value="AL">Alagoas</option>
            <option value="AP">Amapá</option>
            <option value="AM">Amazonas</option>
            <option value="BA">Bahia</option>
            <option value="CE">Ceará</option>
            <option value="DF">Distrito Federal</option>
            <option value="ES">Espírito Santo</option>
            <option value="GO">Goiás</option>
            <option value="MA">Maranhão</option>
            <option value="MT">Mato Grosso</option>
            <option value="MS">Mato Grosso do Sul</option>
            <option value="MG">Minas Gerais</option>
            <option value="PA">Pará</option>
            <option value="PB">Paraíba</option>
            <option value="PR">Paraná</option>
            <option value="PE">Pernambuco</option>
            <option value="PI">Piauí</option>
            <option value="RJ">Rio de Janeiro</option>
            <option value="RN">Rio Grande do Norte</option>
            <option value="RS">Rio Grande do Sul</option>
            <option value="RO">Rondônia</option>
            <option value="RR">Roraima</option>
            <option value="SC">Santa Catarina</option>
            <option value="SP">São Paulo</option>
            <option value="SE">Sergipe</option>
            <option value="TO">Tocantins</option>
        </select>
        <br><br>

        <input type="submit" value="Enviar" name="botao">

    </form>

    <?php  
        if(isset($_GET['botao'])) {
            $nome = $_GET['nome'];
            $email = $_GET['email'];
            $sexo = $_GET['sexo'];
            $endereco = $_GET['endereco'];
            $numero = $_GET['numero'];
            $cidade = $_GET['cidade'];
            $estado = $_GET['estado'];
            $erro = array();

            if(trim($nome) == NULL || trim($nome) == ""){
                $erro[] = "O campo nome deve ser preenchido"; 
            }
            if(trim($email) == NULL || trim($email) == ""){
                $erro[] = "O e-mail deve ser preenchido"; 
            }
            if(trim($sexo) == NULL || trim($sexo) == ""){    
                $erro[] = "O campo sexo deve ser preenchido"; 
            }
            if(trim($endereco) == NULL || trim($endereco) == ""){
                $erro[] = "O endereço deve ser preenchido"; 
            }
            if(trim($numero) == NULL || trim($numero) == ""){
                $erro[] = "O campo numero deve ser preenchido"; 
            }
            if(substr_count($email, "@") != 1){
                $erro[] = "Email inválido"; 
            }
            if(count($erro) == 0) {
                echo "Obrigrado $nome,<br>Seus dados foram enviados com sucesso.";
            } else{
                echo "<pre>";
                print_r($erro);
                echo "</pre>";
            }
        }
    ?>

</body>
</html>