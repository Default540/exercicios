package L4;

import java.util.Scanner;

/**
 * Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o                         
intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0                             
e 10, e a soma dos valores fora deste intervalo.
 */
public class E14 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int quantValor1a10 = 0;
        int quantMult0a10 = 1;
        int somaForaIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();

            if (n >= 1 && n <= 10) {
                quantValor1a10++;
            }
            if (n >= 0 && n <= 10) {
                quantMult0a10 *= n;
            }
            if (n < 0 || n > 10) {
                somaForaIntervalo += n;
            }
        }


        System.out.println("Quantidade de valores entre 1 e 10: "+quantValor1a10+"\nMultiplicação de valores entre 0 e 10: "+quantMult0a10+"\nSoma dos valores fora do intervalo: "+somaForaIntervalo);

        in.close();
    }
}
