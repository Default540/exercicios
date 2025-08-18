import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Inimigo {
    private static final int ALTURA = 25;
    private static final int LARGURA = 5;
    private int x;
    private int y;
    private int velocidade;
    private Color cor;
    private Direcao direcao;

    Inimigo(){
        Random r = new Random();
        this.x = r.nextInt(400);
        this.y = 0;
        this.cor = Color.RED;
        this.velocidade = 1;
        this.direcao = Direcao.BAIXO;
    }

    public void atualizar(){
        this.y += this.velocidade;
    }

    public void setDirecao(Direcao d){
        this.direcao = d;
    }

    public void desenha(Graphics g){
        g.setColor(cor);
        g.fillRect(x, y, LARGURA, ALTURA);
    }
}
