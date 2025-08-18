package L4;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um                               
número primo. Um número é primo quando ele é divisível somente por um e por ele                               
mesmo. Você utilizará uma combinação entre os comandos while e if.
 */
public class E15 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 1;
        int countDiv = 0;
        
        while (n >= count) {
            
            if (n%count == 0) {
                System.out.println("O numero "+n+" é divisivel por "+count);
                countDiv++;
            }
            
            count++;
        }

        if (countDiv == 2) {
            System.out.println("Primo");
        }

        in.close();
    }
}
