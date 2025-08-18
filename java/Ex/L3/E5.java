package L3;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque 3 valores: ");
        
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (n1 < n2+n3 && n2 < n1+n3 && n3 < n2+n1) {
            System.out.println("Forma um triangulo");
        }else System.out.println("Não forma um triangulo");

        in.close();
    }
}
