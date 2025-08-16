package L2;

import java.util.Scanner;

public class E24 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual a idade do h1, h2, m1 e m2:");
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();

        int somaHvMn = 0;
        int produtoHnMv = 0;

        String res = "";

        if (h1>h2 && m1 > m2) {
            somaHvMn = h1+m2;
            produtoHnMv = h2*m1;
            res = "O homem velho é h1 e a mulher velha é m1";
        }else if(h1 < h2 && m1 > m2){
            somaHvMn = h2+m2;
            produtoHnMv = h1*m1;
            res = "O homem velho é h2 e a mulher velha é m1";
        }else if(h1 > h2 && m1 < m2){
            somaHvMn = h1+m1;
            produtoHnMv = h2*m2;
            res = "O homem velho é h1 e a mulher velha é m2";
        }else if (h1 < h2 && m1 < m2) {
            somaHvMn = h2+m1;
            produtoHnMv = h1*m2;
            res = "O homem velho é h2 e a mulher velha é m2";
        }

        System.out.println(res);
        System.out.printf("O resultado da soma é %d e o resultado do produto é %d\n",somaHvMn,produtoHnMv);
        in.close();
    }
}
