package L3;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in); 
        System.out.println("Escreva um valor: ");
        int n = in.nextInt();
        if (n>0) {
            System.out.println("O numero e positivo");
        } else if(n<0){
            System.out.println("O numero é negativo");
        }else System.out.println("O numero é zero");
        in.close();
    }
}
