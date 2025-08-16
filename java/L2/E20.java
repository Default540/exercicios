package L2;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final float precoGasolina = 4.599f;

        System.out.println("Qual a marcação do odometro inicial, marcação do odometro final, quantos litros de combustivel foram gastos e o valor total recebido dos passageiros: ");

        float marcInicial = in.nextFloat();
        float marcFinal = in.nextFloat();
        float totalLitros = in.nextFloat();
        float valorRecebido = in.nextFloat();

        final float totalKm = marcFinal-marcInicial;
        
        int mediaDeConsumoPorKm = (int)totalKm/(int)totalLitros;
        float lucroLiquido = valorRecebido-totalLitros*precoGasolina;

        System.out.printf("A media de consumo é %dKm/L e o lucro liquido é %.2f\n",mediaDeConsumoPorKm,lucroLiquido);

        

        in.close();
    }
}
