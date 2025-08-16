package L1;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        
        final Scanner in = new Scanner(System.in);

        System.out.println("qual a base do triangulo:");
        int b = in.nextInt();
        System.out.println("qual a altura:");
        int a = in.nextInt();

        int area = a*b/2;
        System.out.println("a area do triangulo é "+ area);

        in.close();
    }
}
