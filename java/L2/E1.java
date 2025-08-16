package L2;

import java.util.Scanner;

public class E1 {
    
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("Quantos metros são?");
        float m = in.nextFloat();
        float cm = m*100;

        System.out.printf("%.2f metros são %.2f centimetros.",m,cm);
        in.close();
    }
}
