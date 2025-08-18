package L1;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("qual a primeira nota: ");
        float n1 = in.nextFloat();
        System.out.println("qual a segunda nota: ");
        float n2 = in.nextFloat();
        float media = (n1+n2)/2;
        System.out.printf("Sua media é %.2f\n",media);
        in.close();
    }
}
