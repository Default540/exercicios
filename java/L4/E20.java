package L4;

import java.util.Scanner;

/*
 * Escreva um programa que lê o tamanho do lado de um quadrado e imprime um                             
quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para                   
quadrados com lados de todos os tamanhos entre 1 e 20.
 */
public class E20 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int lado = in.nextInt();

        String quadrado = "";

        for (int c = 0; c < lado; c++) {
            
            for (int i = 1; i <= lado; i++) {
                quadrado += "*";
            }    
            quadrado += "\n";

        }
        

        System.out.println(quadrado);
        in.close();
    }
}
