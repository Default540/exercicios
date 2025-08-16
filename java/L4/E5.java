package L4;

import java.util.Scanner;
/**
 * 
 * Faça um programa que receba a 5 notas de um aluno, através do comando while, e                               
que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma                           
variável nota, e uma variável média. 
 */

public class E5 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        float nota = 0;
        float media = 0;
        

        /**
         * while(true){
            nota = in.nextFloat();
            media += nota;
            nota = in.nextFloat();
            media += nota;
            nota = in.nextFloat();
            media += nota;
            nota = in.nextFloat();
            media += nota;
            nota = in.nextFloat();
            media += nota;
            media = media/5;
            break;
           }
        */

        int count = 0;
        while(count < 5){
            nota = in.nextFloat();
            media += nota;
            count++;
        }
        media = media/5;

        System.out.println(media);

        in.close();
    }
}
