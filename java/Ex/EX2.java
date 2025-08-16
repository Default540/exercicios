package Ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o numero de lados do poligono e a medida do lado(cm): ");
        int nLados = in.nextInt();
        int valorLado = in.nextInt();

        if (nLados == 3) {
            System.out.println("Triangulo. Perimetro => "+(valorLado*3));
        }else if (nLados == 4) {
            System.out.println("Quadrado. Area => "+(valorLado*valorLado));
        }else if (nLados == 5) {
            System.out.println("Pentagono");
        }else System.out.println("Figura desconhecida.");
        in.close();
    }
}
