package L6;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int nAnterior = in.nextInt();
        int n = in.nextInt();

        while (nAnterior*2>=n) {
            nAnterior = n;
            n = in.nextInt();
        }
        in.close();
    }
}
