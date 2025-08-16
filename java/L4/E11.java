package L4;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,                             
deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o                                   
valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor                             
lido pelo segundo valor lido.
 */
public class E11 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = 0;
        do {
            n2 = in.nextInt();
        } while (n2 == 0);

        float res = n1/n2;
        System.out.println(res);
        
        in.close();
    }
}
