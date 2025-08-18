package L6;

import java.util.Scanner;

/*
 * Fazer um programa para ler os dados (matrícula, idade, sexo, altura e
concursado [S/N]) de váriosfuncionários de uma empresa. O último tem a
matrícula igual a zero e não entra nos cálculos. Calcular e mostrar:
a) o número de funcionárias concursadas;
b) o número de funcionários (somente homens);
c) a maior idade dos homens concursados;
d) a quantidade de mulheres com mais de 30 anos sem concurso;
e) a quantidade de concursados(as);
f) a média das alturas dos homens com menos de 40 anos
 */

public class E1 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int nFuncionariasConcursadas = 0;
        int nFuncionariosHomens = 0;

        int maiorIdadeHomens = 0;
        int nFuncionarias30SemConcurso = 0;
        int nFuncionariosConcursados = 0;
        float mediaAltura = 0;
        int countAltura = 0;

        while (true) {
            System.out.println("matrícula, idade, sexo(M/F), altura e concursado [S/N]");
            int matricula = in.nextInt();
            
            if (matricula == 0) {
                if (countAltura >=1) {
                    mediaAltura /= countAltura;    
                }
                
                break;
            }

            int idade = in.nextInt();
            char sexo = in.next().toUpperCase().charAt(0);
            float altura = in.nextFloat();
            char concursado = in.next().toUpperCase().charAt(0);
            
            if (sexo == 'F') {

                if (concursado == 'S') {
                    nFuncionariasConcursadas++;    
                }else if(idade > 30){
                    nFuncionarias30SemConcurso++;
                }
                
            }

            if (sexo == 'M') {
                nFuncionariosHomens++;

                if (idade > maiorIdadeHomens && concursado == 'S') {
                    maiorIdadeHomens = idade;
                }
                if (idade < 40) {
                    countAltura++;
                    mediaAltura += altura;
                }
            }

            if (concursado == 'S') {
                nFuncionariosConcursados++;
            }

        }

        System.out.printf("Numero de Funcionarias Concurçadas=> %d\nNumero de Funcionarios Homens => %d\nMaior idade dos Homens => %d\nFuncionarias com mais de 30 anos não concurçadas => %d\nFuncionarios Concurçados => %d\nmedia idade homens => %f\n",nFuncionariasConcursadas,nFuncionariosHomens,maiorIdadeHomens,nFuncionarias30SemConcurso,nFuncionariosConcursados,mediaAltura);
        in.close();
    }
}
