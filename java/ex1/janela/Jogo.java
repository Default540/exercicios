import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jogo extends JPanel implements ActionListener{
    
    private final int LARGURA = 400;
    private final int ALTURA = 400;
    private Jogador jogador = new Jogador();
    private Inimigo inimigo = new Inimigo();

    Jogo(){
        System.out.println("INICIANDO O JOGO");
        setFocusable(true);
        addKeyListener(new Controle());
        setPreferredSize(new Dimension(LARGURA,ALTURA));
        Timer temporizador = new Timer(17, this);
        temporizador.start();
    }

    private void atualizar(){
        jogador.atualizar();
        inimigo.atualizar();
    }

    @Override
    public void paint(Graphics g) {        
        super.paint(g);
        jogador.desenha(g);
        inimigo.desenha(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        atualizar();    
        repaint();
    }

    private class Controle extends KeyAdapter {
        public void keyPressed(KeyEvent tecla) {
            
            switch (tecla.getKeyCode()) {
                case KeyEvent.VK_D:
                    jogador.setDirecao(Direcao.DIREITA);
                    break;
                case KeyEvent.VK_A:
                    jogador.setDirecao(Direcao.ESQUERDA);
                    break;
                case KeyEvent.VK_W:
                    jogador.setDirecao(Direcao.CIMA);
                    break;
                case KeyEvent.VK_S:
                    jogador.setDirecao(Direcao.BAIXO);
                    break;
                
            }
            
        }

    }
}