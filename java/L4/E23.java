package L4;

import java.util.Scanner;

/*
 * Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material                               
radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos.                         
Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo                       
necessário para que a massa deste material se torne menor que 0,10 grama.
 */
public class E23 {
    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        final float TOTAL_PERDA_DE_MASSA = 0.75f;
        float massa = in.nextFloat();

        int segundos = 0;
        
        while (massa > 0.1f) {
            massa *= TOTAL_PERDA_DE_MASSA;
            segundos += 30;
        }

        System.out.println(segundos+" segundos");
        in.close();
    }
}
