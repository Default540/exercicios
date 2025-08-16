package L2;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final float TAXA_IMPOSTO = 0.45f;
        final float TAXA_DISTRIBUIDOR = 0.28f;

        System.out.println("Qual o preço de frabrica do produto?");
        float precoFabrica = in.nextFloat();

        float total = precoFabrica+precoFabrica*TAXA_DISTRIBUIDOR+precoFabrica*TAXA_IMPOSTO;

        System.out.printf("Preço final => %.2f\n",total);


        in.close();
    }
}
