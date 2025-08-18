package L4;

import java.util.Scanner;

/*
 * Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e                         
apresente o resultado da potência deste número. Faça isso utilizando o comando                       
while. Tenha cuidado com as inicializações!
 */
public class E16 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int expoente = in.nextInt();
        
        int res = 1;
        int count = 1;
        
        while (expoente >= count) {
            res *= n;
            count++;    
        }

        System.out.println(res);

        in.close();
    }
}
