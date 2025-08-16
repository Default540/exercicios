package L2;

import java.util.Scanner;

public class E3{
    public static void main(String[]args){
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque um numero:");
        float n = in.nextFloat();
        if(n >= 0){
            System.out.println("Seu numero é positivo");
        }else{
            System.out.println("Seu numero é negativo");
        }
        in.close();
    }
}