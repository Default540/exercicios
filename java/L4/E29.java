package L4;

import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 100; i < 1000; i++) {

            if (count == 20) {
                System.out.println("(...)");
                in.next();
                count = 0;
            }
            int centena = i/100;
            int resto = i%100;
            int dezena = resto/10;
            int unidade = resto%10;
            int total = centena*dezena*unidade;
            System.out.printf("%d (%d*%d*%d) = %d\n",i,centena,dezena,unidade,total);
            count++;
        }
        in.close();
    }
}
