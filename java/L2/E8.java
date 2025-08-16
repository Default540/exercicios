package L2;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o numero de votos em branco, o numero de votos nulos e o numero de votos validos: ");
        
        int nVotosBrancos = in.nextInt();
        int nVotosNulos = in.nextInt();
        int nVotosValidos = in.nextInt();
        int nVotos = nVotosBrancos+nVotosValidos+nVotosNulos;

        float porcentBranco = (float)nVotosBrancos*100/nVotos;
        float porcentNulos = (float)nVotosNulos*100/nVotos;
        float porcentValidos = (float)nVotosValidos*100/nVotos;
        float porcentVotos = (float)nVotos*100/nVotos;

        System.out.printf("Numero de votos totais => %d, porcentagem => %.1f%%\nNumero de votos brancos => %d, porcentagem => %.1f%%\nNumero de votos nulos => %d, porcentagem => %.1f%%\nNumero de votos validos => %d, porcentagem => %.1f%%\n",nVotos,porcentVotos,nVotosBrancos,porcentBranco,nVotosNulos,porcentNulos,nVotosValidos,porcentValidos);

        in.close();
    }
}
