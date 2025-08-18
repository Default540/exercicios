package L6;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        
        int max = in.nextInt();
        int nAnterior = 0;
        int n = 1;
        System.out.println(nAnterior);

        do {
            System.out.println(n);
            int save = n;
            n += nAnterior;
            nAnterior = save;
            
        } while (n<=max);
        in.close();
    }
}
