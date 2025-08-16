package L4;

import java.util.Scanner;

/**
 * Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor                               
lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após                               
a leitura do valor, escrever o valor lido na tela.
 */
public class E6 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = 0;

        do{
            n = in.nextInt();

        }while(!(1<=n && n<=10));

        System.out.println(n);
        in.close();
    }
}
