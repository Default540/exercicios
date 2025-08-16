package L2;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual sua idade:");
        int idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("Adulto");
        }else if(idade >=14 && idade < 18){
            System.out.println("Juvenil");
        }else if(idade >= 9 && idade < 14){
            System.out.println("Infantil");
        }else{
            System.out.println("Mirim");
        }

        in.close();
    }
}
