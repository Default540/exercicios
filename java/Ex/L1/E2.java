package L1;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        System.out.println("digite um numero:");
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        n *= 1.2;
        System.out.printf("O numero atualizado com 20%% é %.2f\n", n);
        in.close();
    }
}
