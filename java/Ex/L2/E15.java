package L2;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual hora começou: ");
        int hI = in.nextInt();
        System.out.println("Qual hora terminou: ");
        int hF = in.nextInt();

        final int maxH = 24;
        

        if (hI > maxH) {
            hI = hI-maxH;
        }
        if (hF > maxH) {
            hF = hF-maxH;
        }


        int res = hF-hI;

        if (hF<hI) {
            res = maxH - hI + hF;     
        }

        System.out.println("O jogo durou "+res+"h");
        in.close();
    }
}
