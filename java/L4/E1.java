package L4;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva um numero:");
        int n1 = in.nextInt();
        int res = 0;

        for (int i = 0; i <= n1; i++) {
            res = res+i;
        }
        System.out.println(res);
        in.close();
    }
}
