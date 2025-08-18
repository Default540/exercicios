package exercicio;

public class Contato {
    String nome = "sla";
    String telefone;
    String email;

    Contato() {
        nome = "sla";
    }

    Contato(String n) {
        this.nome = n;
    }
    
    

    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Telefone: "+telefone);
        System.out.println("Email: "+email);
    }

    public String detalha(){
        return "Nome: "+nome+"\nTelefone: "+telefone+"\nEmail: "+email;
    }

    public void atualizarTelefone(String newTel){

        if (newTel.length() != 11 || newTel.charAt(2) != '9') {
            System.err.println("erro");
        }else{
            telefone = newTel;
        }

    }
}
