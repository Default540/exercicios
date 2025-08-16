package L3;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual combustivel (A/G) e quantos litros vai comprar: ");
        char combustivel = in.next().toUpperCase().charAt(0);
        int litros = in.nextInt();
        final float g = 4.3f;
        final float a = 3.9f;
        
        float desconto,total;

        if (combustivel == 'A') {
                
            if (litros <= 20) {
                desconto = 0.03f;
            }else{
                desconto = 0.05f;
            }
            
            total = a*litros - a*litros*desconto;

        }else{ 
            
            if (litros <= 20) {
                desconto = 0.04f;
            }else{
                desconto = 0.06f;
            }

            System.out.println(g*litros+" "+g*litros*desconto);
            total = g*litros - g*litros*desconto;
        }

        
        System.out.println("O valor total é "+total);


        in.close();
    }
}
