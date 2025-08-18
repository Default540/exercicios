package L4;

import java.util.Scanner;

/*
 * Escreva um programa em JAVA para calcular a média de valores PARES e                           
ÍMPARES, que serão digitados pelo usuário. Ao final o algoritmo deve mostrar estas                         
duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o                           
menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo.
 */
public class E21 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        float mediaImpar = 0;
        float mediaPar = 0;
        int maiorPar = 0;
        int menorImpar = 0;

        int countPar = 0;
        int countImpar = 0;
        while (true) {
            int n = in.nextInt();

            if (n < 0) {
                mediaImpar /= countImpar;
                mediaPar /= countPar;
                break;
            }

            if (n%2==0) {
                if (n > maiorPar) {
                    maiorPar = n;
                }
                mediaPar += n;
                countPar++;
            }else{
                if (n < menorImpar || menorImpar == 0) {
                    menorImpar = n;
                }
                mediaImpar += n;
                countImpar++;
            }

        }
        
        
        System.out.printf("Media Par: %f\nMedia Impar: %f\nMenor Impar: %d\nMaior Par: %d",mediaPar,mediaImpar,menorImpar,maiorPar);

        in.close();
    }
}
