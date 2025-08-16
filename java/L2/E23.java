package L2;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("Qual a quantidade atual em estoque, quantidade maxima do estoque, quantidade minima do estoque de um produto: ");

        int quantAtual = in.nextInt();
        int quantMax = in.nextInt();
        int quantMin = in.nextInt();


        int quantMedia = (quantMax+quantMin)/2;

        if (quantAtual >= quantMedia) {
            System.out.println("Não efetuar compra");
        }else System.out.println("Efetuar compra");


        in.close();
    }
}
