package L6;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = "";

        for (int i = 1; i <= n; i++) {
            res += "*";
            System.out.println(res);
        }
        in.close();
    }
}
