package exercicio;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Contato c1 = new Contato();
        //c1.nome = "João Santos";
        c1.telefone = "53991869999";

        c1.exibir();

        System.out.println(c1.detalha());
        
        //dd 9 xxxxxxxx
        c1.atualizarTelefone("53912345678");
        c1.exibir();
    }
}