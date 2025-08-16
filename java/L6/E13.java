package L6;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        final float TAXA_X = 0.03f;
        final float TAXA_Y = 0.015f;

        int count = 0;
        while (x<=y) {
            count++;
            x += x*TAXA_X;
            y += y*TAXA_Y;
        }
        System.out.printf("Cidade A: %.0f\nCidade B: %.0f\nTempo: %d anos\n",x,y,count);
        in.close();

    }
}
