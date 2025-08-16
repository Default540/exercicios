package L4;

import java.util.Scanner;

/*
 * Desenvolva um programa em Java que determine o pagamento bruto de cada um de                           
vários empregados. A companhia paga o valor de uma "hora normal" pelas primeiras                         
40 horas trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma                             
vez e meia a hora normal) para cada hora trabalhada depois de completadas as                           
primeiras 40 horas. Seu programa deve primeiramente receber a informação de                     
quantos empregados trabalharam durante a semana. Em seguida, receba cada uma                     
das informações acima descritas, para cada empregado, e mostre o pagamento                     
bruto para cada um deles. O valor da hora de cada empregado deve ser também                             
solicitado, pois pode ser diferente para cada empregado.
 */

public class E17 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        
        System.out.println("Quanto vale a hora? Quantas pessoas tem?");
        float valorH = in.nextFloat();
        int quantPessoas = in.nextInt();
        int count = 1;

        String res = "";
        
        while (quantPessoas >= count) {
            System.out.println("Quantas horas trabalhou a pessoa "+count);
            int quantH = in.nextInt();
            int horaExtra = 0;

            if (quantH > 40) {
                horaExtra = quantH-40;
                quantH = 40;
            }
            float totalH = quantH*valorH;
            float totalBonus = horaExtra*valorH*1.5f;

            res += String.format("Pessoa %d\nHoras Totais: %d\nHoras de Trabalho: %d => %.2f\nHora Extra: %d => %.2f\nRecebe %.2f\n", count,(horaExtra+quantH),quantH,totalH,horaExtra,totalBonus,(totalBonus+totalH));

            count++;
        }

        System.out.println(res);

        in.close();
        
    }
}
