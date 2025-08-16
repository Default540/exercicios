package L4;

import java.util.Scanner;

/*
 * Existem três candidatos a uma vaga no Senado. Feita a eleição, os votos são                           
registrados em disco. O voto de cada eleitor foi codificado da seguinte forma: 
 
Deseja-se saber: 
- O número do candidato vencedor; 
- O número de votos em branco; 
- O número de votos nulos; 
- O número de eleitores que compareceram às urnas. 
 
Admite-se que não são possíveis empates. Então, construa um algoritmo em Java                       
que execute esta tarefa, sabendo que o voto de cada eleitor é lido pelo Scanner. O                               
voto finalizador tem código –1, e não deve ser computado.
 */

public class E26 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int vencedor = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int numeroEleitores = 0;
        int c22 = 0;
        int c13 = 0;
        int c32 = 0;

        while (true) {
            
            System.out.println("Candidatos 22, 13 e 32\nColoque o numero: (branco: 0)");
            int n = in.nextInt();
            if (n == -1) {
                break;
            }else if (n == 0) {
                votosBrancos++;
            }else if (n == 22) {
                c22++;
            }else if (n == 13) {
                c13++;
            }else if (n == 32) {
                c32++;
            }else{
                votosNulos++;
            }
            numeroEleitores++;
        }

        if (c22 > c13 && c22 > c32) {
            vencedor = 22;
        }else if (c13 > c22 && c13 > c32) {
            vencedor = 13;
        }else{
            vencedor = 32;
        }

        System.out.printf("O vencedor é o candidato %d\nCandidato 22: %d Votos\nCandidato 13: %d votos\nCandidato 32: %d votos\nVotos Brancos: %d votos\nVotos Nulos: %d\nNumero de Eleitores: %d\n",vencedor,c22,c13,c32,votosBrancos,votosNulos,numeroEleitores);
        in.close();
    }
}
