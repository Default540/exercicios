package Ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva a idade do primeiro homem, segundo homem, primeira mulher e segunda mulher:");

        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int hv,mv,hn,mn;

        if (h1>h2) {
            hv = h1;
            hn = h2;
        }else {
            hv = h2;
            hn = h1;
        }
        if (m1>m2) {
            mv = m1;
            mn = m2;
        }else {
            mn = m1;
            mv = m2;
        }

        int somaHvMn = hv+mn;
        int prodHnMv = hn*mv;
        
        System.out.printf("O homem mais velho tem %d anos\nO homem mais novo tem %d anos\nA mulher mais velha tem %d anos\nA mulher mais nova tem %d anos\na soma entre o homem mais velho com a mulher mais nova é %d\nO produto do homem mais novo com a mulher mais velha é %d",hv,hn,mv,mn,somaHvMn,prodHnMv);
        in.close();
    }
}
