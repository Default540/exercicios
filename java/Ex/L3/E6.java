package L3;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva o nome do time 1, os pontos do time 1, o nome do time 2 e os pontos do time 2 respectivamente:");
        
        String nomeT1 = in.next();
        int pontosT1 = in.nextInt();
        String nomeT2 = in.next();
        int pontosT2 = in.nextInt();
        String vencedor = "";

        if (pontosT1>pontosT2) {
            vencedor = nomeT1;
        }else if (pontosT1<pontosT2) {
            vencedor = nomeT2;
        }else vencedor = "EMPATE";

        System.out.printf("O vercedor é %s\n",vencedor);

        in.close();
    }
}
