package L2;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("Qual o numero de carros vendidos, o valor total das vendas, o salario fixo e valor por carro vendido: ");

        int nCarros = in.nextInt();
        float totalVenda = in.nextFloat();
        float salarioFixo = in.nextFloat();
        final float valorPorCarro = in.nextFloat();
        final float comicaoTotalVenda = 0.05f;

        float salarioFinal = salarioFixo+valorPorCarro*nCarros+totalVenda*comicaoTotalVenda; 
        
        System.out.println("O valor total para pagar o vendedor é "+salarioFinal);

        in.close();
    }
}
