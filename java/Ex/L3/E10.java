package L3;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual sua altura e qual seu sexo (h/m):");
        float h = in.nextFloat();
        char s = in.next().toLowerCase().charAt(0);
        float p;

        if (s == 'h') {
            p = (72.7f*h)-58;
        }else{
            p = (62.1f*h)-44.7f;
        }

        System.out.println("Seu peso ideal é: "+p);
        in.close();
    }
}
