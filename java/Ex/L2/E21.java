package L2;
import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o comprimento da pista(m), numero de voltas, o numero de reabastecimentos e consumo do carro(Km/L):");

        int comprimentoPista = in.nextInt();
        int numeroDeVoltas = in.nextInt();
        int numeroDeReabastecimentos = in.nextInt();
        float consumo = in.nextFloat();

        int distanciaTotal = comprimentoPista*numeroDeVoltas/1000;

        float litrosTotal = distanciaTotal/consumo;

        float quantLreabast = litrosTotal/numeroDeReabastecimentos;
        
        //float quantLreabast = comprimentoPista*numeroDeVoltas/1000/consumo/numeroDeReabastecimentos;

        System.out.println("É necessario abastecer "+quantLreabast+"L");

        in.close();
    }
}
