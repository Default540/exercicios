package L4;
import java.util.Scanner;
/*
 * Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente                         
idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem                             
que ser maior que 0 e menor que 150. Escrever a idade lida.
 */

public class E9{
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        
        int idade = 0;
        do{
            idade = in.nextInt();

        }while(idade <= 0 || idade > 150);

        System.out.println(idade);
        in.close();
    }
}