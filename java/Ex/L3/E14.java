package L3;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque três notas:");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float n3 = in.nextFloat();
        float media = (n1+n2+n3)/3;
        String conceito = "";
        if (media < 6) {
            conceito = "D";
        }else if (media < 7.5f) {
            conceito = "C";
        }else if (media < 9) {
            conceito = "B";
        }else{
            conceito = "A";
        }

        System.out.println("Conceito => "+conceito);

        in.close();
    }
}
