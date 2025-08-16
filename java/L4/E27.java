package L4;

import java.util.Scanner;

/*
 * Faça um programa que receba um valor inteiro, e imprima na tela o dobro dele, ao                               
lado da soma com seu antecessor. Faça isso consecutivamente, imprimindo sempre                     
o dobro do valor que apareceu na tela e a soma com o antecessor, por N vezes. O                                   
valor de N é fornecido pelo usuário. Por exemplo: Recebe o valor inteiro 2, e N = 3,                                   
então imprime: 
 
Dobro = 4   Soma com Antecessor = 4 
Dobro = 8   Soma com Antecessor = 12 
Dobro = 16   Soma com Antecessor = 24 
Dobro = 32  Soma com Antecessor = 48 
 
 
O limite de execução é quando atingir o valor de N, ou quando o dobro ou a soma                                   
atingirem o valor inteiro de 100.000. 
 */

public class E27 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int n = in.nextInt();

        int antecessor = 0; 
        int count = 0;

        while (n > count ) {
            
            antecessor = numero;
            numero *=2;
            System.out.println("Dobro = "+numero+" Soma com Antecessor = " + (numero+antecessor));
            

            count++;
        }
        in.close();
     
    }
}
