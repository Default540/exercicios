package L4;

import java.util.Scanner;

/**
 * Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.
 */
public class E2 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        in.close();
    }
}
