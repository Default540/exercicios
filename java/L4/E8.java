package L4;

import java.util.Scanner;

//package L4;
/*
 * Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva                           
um algoritmo que permita a entrada das seguintes informações: 
a) o número total de mercadorias no estoque 
b) o valor de cada mercadoria. 
Ao final imprimir o valor total em estoque e a média dos valores das mercadorias
 */
public class E8 {
    public static void main(String[] args) {
        
        final Scanner in = new Scanner(System.in);
        
        int quantMercadorias = in.nextInt();

        float totMercadorias = 0;
        

        int count = 0;
        while (count < quantMercadorias) {
            System.out.println("quanto custa a mercadoria "+(count+1));
            float preco = in.nextFloat();
            totMercadorias+=preco;
            count++;
        }
        
        float mediaValores = totMercadorias/quantMercadorias;
        System.out.println("Total de Mercadorias: "+totMercadorias+"\nMedia de mercadorias: "+mediaValores);

        in.close();
    }
}
