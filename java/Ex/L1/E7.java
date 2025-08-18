package L1;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual a distancia do trajeto (Km):");
        int d = in.nextInt();
        System.out.println("Qual a velocidade (Km/h):");
        int v = in.nextInt();
        int t = d/v;
        System.out.printf("O tempo é %dh\n",t);
        in.close();
    }
}
