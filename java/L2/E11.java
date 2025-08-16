package L2;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque dois numeros:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        
        int res = n1+n2;

        if (res >20) {
            System.out.println(res+8);
        } else {
            System.out.println(res-10);
        }
        in.close();
    }
}
