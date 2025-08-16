package L4;

import java.util.Scanner;

/*
 * Dado um país A, com X habitantes e uma taxa de natalidade de 3% ao ano, e um                                   
país B com Y habitantes e uma taxa de natalidade de 2% ao ano, escrever um                               
algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário                             
para que a população do país A ultrapasse a população do país B. Considere que X                               
< Y.
 */
public class E22 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final float TAXA_DE_NATALIDADE_PAIS_A = 0.03f;
        final float TAXA_DE_NATALIDADE_PAIS_B = 0.02f;

        float x = in.nextFloat();
        float y = in.nextFloat();

        int count = 0;
        while (x<y) {
            
            x += x*TAXA_DE_NATALIDADE_PAIS_A;
            
            y += y*TAXA_DE_NATALIDADE_PAIS_B;

            count++;
        }

        System.out.printf("O pais A passara o pais B após %d anos\nPopulação A: %.0f\nPopulação B: %.0f\n", count,x,y);

        in.close();
    }
}
