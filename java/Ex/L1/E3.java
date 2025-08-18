package L1;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        System.out.println("Escreva um numero inteiro:");
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        n*=n;
        
        System.out.println("O seu numero ao quadrado é "+ n);
        in.close();
    }
}
