package L1;

import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        System.out.println("digite um numero:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.printf("O numero antecessor de %d é %d\n",n,n-1);
        in.close();
    }
}
