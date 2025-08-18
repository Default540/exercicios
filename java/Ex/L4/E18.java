package L4;

import java.util.Scanner;

/**
 * Faça um programa que, para um número indeterminado de pessoas: leia a idade de                           
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser                                 
considerada. A seguir calcule: 
• o número de pessoas; 
• a idade média do grupo; 
• a menor idade e a maior idade
 */
public class E18 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int count = 0;
        int menor = 1000;
        int maior = 0;
        float media = 0;
        while(true){
            int idade = in.nextInt();
            if (idade == 0) {
                break;
            }else if (idade > maior) {
                maior = idade;
            }
            
            if (idade < menor) {
                menor = idade;
            }
            media += idade;
            count++;    
        }

        media /= count;
        System.out.printf("Numero de Pessoas: %d\nIdade Media: %f\nMenor Idade: %d\nMaior Idade: %d\n",count,media,menor,maior);
        in.close();
    }
}
