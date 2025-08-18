package L6;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        while (true) {
            int n = 0;
            do {
                System.out.println("Digite um numero: ");
                n = in.nextInt();
                if (n<= 0) {
                    System.out.println("Valor incorreto "+n);
                }
            } while (n <= 0);

            String res = "";

            for (int i = 1; i <= n; i++) {
                if (i%2 == 0) {
                    res += i+" ";        
                }
            }
            System.out.println("Valores pares: " + res);

            System.out.println("Desejam continuar?");
            String contin= in.next().toLowerCase();

            if (contin.equals("nao") || contin.equals("não")) {
                break;
            }
        }
        in.close();
    }
}
