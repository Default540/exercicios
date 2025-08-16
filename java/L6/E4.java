package L6;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        float e = 0;
        for (int i = 1; i <= n; i++) {
            int fat = 1;

            for (int j = 1; j <= i; j++) {
                fat*=j;
            }

            System.out.println("1/"+fat+" => "+(1/ (float)fat));
            e += 1/(float)fat;
            
        }

        System.out.println("E = "+e);
        in.close();
    }
}
