package L4;

import java.util.Scanner;

/*
 * Escreva um algoritmo em Java que receba vários números e verifique se eles são ou                             
não quadrados perfeitos. O algoritmo termina a execução quando for digitado um                       
número menor ou igual a 0. (Um número é quadrado perfeito quando tem um                           
número inteiro como raiz quadrada.). Obs: não deve ser utilizado métodos da classe                         
Math.
 */

public class E25 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n <= 0) {
                break;
            }

            int count = 0;
            while (true) {
                if (count*count == n) {
                    System.out.println("Quadrado perfeito");
                    break;
                }
                
                if (count*count > n) {
                    System.out.println("Não é quadrado perfeito");
                    break;
                }

                count++;
            }

            
        }
        in.close();
    }
}
