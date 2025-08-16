package L2;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva as notas:");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float med = (n1+n2)/2;

        if (med >= 6) {
            System.out.println("Aprovado\nMedia => "+med);
        } else {
            System.out.println("Reprovado\nMedia => "+med);    
        }
        

        in.close();
    }
}
