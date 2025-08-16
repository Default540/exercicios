package L4;

import java.util.Scanner;

/*
 * Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,                         
idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar: 
- O atleta do sexo masculino mais alto; 
- A atleta do sexo feminino mais pesada; 
- A média de idade dos atletas. 
Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta.
 */
public class E24 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        float mediaIdade = 0;
        
        float mPesada = 0;
        float hAlto = 0;

        String nomeHalto = "";
        String nomeMpesada = "";

        int count = 0;
        while(true){
            System.out.println("Qual o nome, sexo (H/M), idade, peso e altura: ");
            
            String nome = in.next();
            if (nome.equals("@")) {
                break;
            }
            
            char sexo = in.next().toUpperCase().charAt(0);
            int idade = in.nextInt();
            float peso = in.nextFloat();
            float altura = in.nextFloat();

            if (sexo == 'H' && hAlto < altura) {
                
                hAlto = altura;
                nomeHalto = nome;

            } else if(sexo == 'M' && mPesada < peso){
                mPesada = peso;
                nomeMpesada = nome;
            }
            
            mediaIdade+=idade;
            count++;    
        }

        mediaIdade /= count;

        System.out.printf("Nome Mulher Pesada: %s\nNome Homem Alto: %s\nMedia Idade: %f\n",nomeMpesada,nomeHalto,mediaIdade);

        in.close();
    }
}
