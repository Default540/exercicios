package L2;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual a altura, largura e comprimento da cozinha: ");
        final float areaCaixa = 1.5f;
        float altura = in.nextFloat();
        float largura = in.nextFloat();
        float profundidade = in.nextFloat();

        float areaCozinha = altura*largura*profundidade;

        float totalCaixas = areaCozinha/areaCaixa;

        System.out.println("O maximo de caixas possiveis são "+((int)totalCaixas));
        
        in.close();
    }
}
