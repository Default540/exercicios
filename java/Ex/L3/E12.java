package L3;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Quantos lados e qual a medida do lado:");
        int nLados = in.nextInt();
        float mLado = in.nextFloat();

        if (nLados < 3) {
            System.out.println("Não é um poligono");
        }else if (nLados == 3) {
            System.out.println("Triangulo. Perimetro => "+(mLado*3));
        }else if (nLados == 4) {
            System.out.println("Quadrado. Area => "+ (mLado*mLado));
        }else if (nLados == 5) {
            System.out.println("Pentagono.");
        }else{
            System.out.println("Poligono não indentificado");
        }

        in.close();
    }
}
