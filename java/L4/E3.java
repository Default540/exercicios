package L4;

import java.util.Scanner;

/**
 * Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.
 */
public class E3 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean primo = true;
        for (int i = n-1; i > 1; i--) {
            if (n%i == 0) {
                primo=false;
            }
        }
        if (primo) {
            System.out.println("Primo");    
        }else{
            System.out.println("Não é primo");
        }
        in.close();
    }
}
