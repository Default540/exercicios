package L4;

import java.util.Scanner;

/*
 * Crie um programa para informar quais e quantas notas são necessárias para                       
entregar o mínimo de cédulas para um determinado valor informado pelo usuário                       
considerando notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve                                   
mostrar apenas as notas utilizadas. Por exemplo, ao solicitar R$18, o programa deve                         
informar apenas a seguinte informação (note que não foram exibidas informações                     
sobre as demais cédulas):  
1 nota(s) de R$ 10.  
1 nota(s) de R$ 5.  
3 nota(s) de R$ 1.  
 
O programa deve ficar perguntando qual o próximo valor a ser sacado até que seja                             
informado o número 0.
 */

public class E28 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        
        System.out.println("Quais notas são (sair: 0):");
        

        

        while (true) {
            System.out.println("Quanto dinheiro vai sacar?");
            int sacar = in.nextInt();
            if (sacar == 0) {
                break;
            }
            
            
            int notas = sacar/100;
            float resto = sacar%100;
            
            if (notas != 0) {
                System.out.printf("%d notas de 100\n",notas);
            }
            
            notas = (int) (resto/50);
            resto = resto%50;

            if (notas > 0) {
                System.out.printf("%d notas de 50\n", notas);
            }

            notas = (int) (resto / 20);
            resto = resto % 20;

            if (notas > 0) {
                System.out.printf("%d notas de 20\n", notas);
            }

            notas = (int) (resto / 10);
            resto = resto % 10;

            if (notas > 0) {
                System.out.printf("%d notas de 10\n", notas);
            }

            notas = (int) (resto / 5);
            resto = resto % 5;

            if (notas > 0) {
                System.out.printf("%d notas de 5\n", notas);
            }

            notas = (int) (resto / 2);
            resto = resto % 2;

            if (notas > 0) {
                System.out.printf("%d notas de 2\n", notas);
            }

            notas = (int) (resto / 1);
            resto = resto % 1;

            if (notas > 0) {
                System.out.printf("%d notas de 1\n", notas);
            }   
        }
        in.close();
    }
}
