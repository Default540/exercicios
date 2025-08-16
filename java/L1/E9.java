package L1;
import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int h = 400;
        int m = 320;
        int c = 200;

        System.out.println("Quantos homens vão ir:");
        int qh = in.nextInt();
        System.out.println("Quantas mulheres vão ir:");
        int qm = in.nextInt();
        System.out.println("Quantos crianças vão ir:");
        int qc = in.nextInt();

        float quant = (qh*h+qm*m+qc*c)*1.2f;

        System.out.printf("você precisa comprar %.0f gramas de carne.",quant);
        in.close();
    }
}
