package L3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva o valor de n1, n2 e n3:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int res = 0;

        if (n3>n1 && n2>n1) {
            res = n2+n3;
        }else if (n3>n2 && n1>n2) {
            res = n1+n3;
        }else if (n2>n3 && n1>n3) {
            res = n1+n2;
        }
        System.out.println(res);
        in.close();
    }
}
