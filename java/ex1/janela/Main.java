import javax.swing.JFrame;

/**
 * Mainasd
 */
public class Main {

    public static void main(String[] args) {
        
        //janela
        JFrame janela = new JFrame("APP");

        // oque fazer quando clicar no x
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tamanho
        //janela.setSize(400, 400);

        Jogo jogo = new Jogo();
        janela.add(jogo);
        janela.pack(); // para a janela calcular o seu tamanho baseada nos componentes
        
        //mostrar
        janela.setVisible(true);
    }
}