package L2;

import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.err.println("Quanto custa o produto: ");
        float preco = in.nextFloat();
        System.out.println("O cofrinho tem quantas moedas de 1 real, 50 centavos, 25 centavos, 10 centavos e 5 centavos respectivamente: ");
        int quant1Real = in.nextInt();
        int quant50Centavos = in.nextInt();
        int quant25Centavos = in.nextInt();
        int quant10Centavos = in.nextInt();
        int quant5Centavos = in.nextInt();

        float totalCrofrinho = quant1Real*1+quant50Centavos*0.5f+quant25Centavos*0.25f+quant10Centavos*0.1f+quant5Centavos*0.05f;

        if (totalCrofrinho >= preco) {
            System.out.printf("Você possui R$%.2f e o preço total a pagar é R$%.2f\nTroco: R$%.2f\n",totalCrofrinho,preco,(totalCrofrinho-preco));
        }else{
            System.out.printf("Não é possivel pagar.\nFalta: R$%.2f\n",(preco-totalCrofrinho));
        }
        in.close();
        
    }
}
