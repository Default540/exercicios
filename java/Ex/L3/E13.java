package L3;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o nome do produto, quantidade adquirida e o preço da unidade.");
        String nome = in.next();
        int quant = in.nextInt();
        float preco = in.nextFloat();
        float desc = 0;
        
        if (quant <= 5) {
            desc = 0.02f;
        }else if (quant <= 10) {
            desc = 0.03f;
        }else{
            desc = 0.05f;
        }

        float total = preco*quant;
        float totalPagar = total - total*desc;

        System.out.printf("Produto: %s\nPreço: %.2f\nDesconto aplicado: %.0f%%\nTotal: %.2f\n",nome,total,(desc*100),totalPagar);

        in.close();
    }
}
