package L4;

import java.util.Scanner;

/*
 * Faça um programa que mostre n primeiros valores da sequência de Fibonacci, a                         
sequência é feita da seguinte maneira: 1 1 2 3 5 8 13 21 34 55 ...
 */
public class E19 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sequencia = 1;
        int anterior = 0;
        int count = 0;
        while (n > count) {

            System.out.println(sequencia);
            int save = sequencia;
            sequencia += anterior;
            anterior = save;
            count++;
        }

        in.close();
    }
}
