package L2;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Quantas maças:");
        int macas = in.nextInt();
        float preco;

        if (macas < 12) {
            preco = macas*1.5f;
        } else {
            preco = macas*1.3f;
        }

        System.out.println("Total: "+preco);
        in.close();

    }
}
