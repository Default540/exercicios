import java.awt.Color;
import java.awt.Graphics;

public class Jogador {
    private static final int TAMANHO = 20;
    private int x;
    private int y;
    private int velocidade;
    private Color cor;
    private Direcao direcao;

    Jogador(){
        this.x = 0;
        this.y = 0;
        this.cor = Color.BLUE;
        this.velocidade = 1;
        this.direcao = Direcao.DIREITA;
    }
    
    public void atualizar(){

        if (this.direcao == Direcao.DIREITA)this.x += this.velocidade;

        if (this.direcao == Direcao.ESQUERDA)this.x -= this.velocidade;

        if (this.direcao == Direcao.CIMA)this.y -= this.velocidade;
        
        if (this.direcao == Direcao.BAIXO)this.y += this.velocidade;

        if (this.y == 400 - TAMANHO && this.direcao == Direcao.BAIXO)
        setDirecao(Direcao.CIMA);
        
        if (this.y == 0 && this.direcao == Direcao.CIMA)
        setDirecao(Direcao.BAIXO);
        
        if (this.x == 400 - TAMANHO && this.direcao == Direcao.DIREITA)
        setDirecao(Direcao.ESQUERDA);
        
        if (this.x == 0 && this.direcao == Direcao.ESQUERDA)
        setDirecao(Direcao.DIREITA);

    }

    public void setDirecao(Direcao d){
        this.direcao = d;
    }

    public void desenha(Graphics g){
        g.setColor(cor);
        g.fillRect(x, y, TAMANHO, TAMANHO);
    }
}
