package L4;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do                           
salário para aceitar somente um “salário válido”. Você deve definir o que é um                            
“salário válido”. Escrever o salário lido
 */
public class E10 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        float salario = 0;

        
        do{
            salario = in.nextFloat();
        }while(salario <= 0);

        System.out.println(salario);
        in.close();
    }
}
