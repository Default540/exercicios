package L6;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        float res = 1+x;

        for (int i = 2; i <= 10; i++) {
            int xpotencia = 1;
            int fat = 1;
            
            for (int j = 1; j <= i; j++) {
                xpotencia *= x;
                fat *= j;
            }
            System.out.printf("%d^%d/%d!  =>  %d/%d  =>  %f\n",x,i,i,xpotencia,fat,(float)xpotencia/fat);
            res+= xpotencia/(float)fat;
        }
        System.out.println("e^x => "+res);
        in.close();
    }
}
