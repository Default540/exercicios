package L6;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Quantos funcionarios:");
        int n = in.nextInt();
        
        float mediaM = 0;
        int countM = 0;
        String nomeM = "";
        float maiorSalarioM = 0;

        float mediaF = 0;
        int countF = 0;
        String nomeF = "";
        float maiorSalarioF = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Nome, sexo[M/F] e salario:");
            String nome = in.next();
            char sexo = in.next().toUpperCase().charAt(0);
            float salario = in.nextFloat();
            if (sexo == 'F') {
                if (salario > maiorSalarioF) {
                    maiorSalarioF = salario;
                    nomeF = nome;    
                }
                mediaF+=salario;
                countF++;        
            }else if (sexo == 'M') {
                if (salario > maiorSalarioM) {
                    maiorSalarioM = salario;
                    nomeM = nome;    
                }
                
                mediaM+=salario;
                countM++;
            }   
        }

        mediaF /= countF;
        mediaM /= countM;

        System.out.printf("Maior salario M: %s => %.2f\nMaior salario F: %s => %.2f\nMedia M: %.2f\nMedia F: %.2f\n",nomeM,maiorSalarioM,nomeF,maiorSalarioF,mediaM,mediaF);
        in.close();
    }
}
