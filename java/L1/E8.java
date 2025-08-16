package L1;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        
        System.out.println("Qual a quantidade de eleitores: ");
        int nEleitores = in.nextInt();

        System.out.println("Qual a quantidade de votos validos:");
        int votosValidos = in.nextInt();

        System.out.println("Qual o numero de votos brancos:");
        int votosBrancos = in.nextInt();

        System.out.println("Qual o numero de votos nulos:");
        int votosNulos = in.nextInt();


        int porcentValidos = (votosValidos*100)/nEleitores;
        int porcentBrancos = (votosBrancos*100)/nEleitores;
        int porcentNulos = (votosNulos*100)/nEleitores;

        System.out.println("porcentagem de votos validos: "+ porcentValidos+"%");
        System.out.println("porcentagem de votos brancos: "+ porcentBrancos+"%");
        System.out.println("porcentagem de votos nulos: "+ porcentNulos+"%");
        in.close();
    }
}
