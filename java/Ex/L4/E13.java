package L4;

import java.util.Scanner;

/*
 * Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas                             
maiores notas para o cálculo da média. Apresente a média final, entre as duas                           
maiores notas. Dica: utilize 3 comandos if.
 */
public class E13 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        float[] n = new float[2];

        for (int i = 0; i < 3; i++) {
            n[i] = in.nextFloat();
        }

        /* float nota1 = Math.max(Math.max(n[0],n[1]),n[2]);

        float nota2 = Math.min(Math.max(n[0],n[1]),Math.max(n[1], n[2])); */

        float nota1;
        float nota2;

        if (n[1] > n[0] && n[2] > n[0]) {
            nota1 = n[1];
            nota2 = n[2];   
        }else if (n[0] > n[1] && n[2] > n[1]) {
            nota1 = n[0];
            nota2 = n[2];
        }else{
            nota1 = n[1];
            nota2 = n[0];
        }

        float media = (nota1+nota2)/2;
        
        System.out.println(media);

        in.close();
    }
}
