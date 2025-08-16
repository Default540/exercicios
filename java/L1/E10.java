package L1;
import java.util.Scanner;
public class E10{
    public static void main(String [] args){
        
        final Scanner in = new Scanner(System.in);
        
        System.out.println("Qual o valor do ingresso:");
        float valorIngreso = in.nextFloat();
        System.out.println("Quantos são sócios do clube:");
        int socios = in.nextInt();
        System.out.println("Quantos não pagão (menores de 10 anos):");
        int menores = in.nextInt();
        System.out.println("Quantos pagão o valor total:");
        int publico = in.nextInt();

        int nPessoas = socios+menores+publico;

        float rendTot = socios*0.7f*valorIngreso+valorIngreso*publico;

        float rendPerd = socios*0.3f*valorIngreso+menores*valorIngreso;

        System.out.println("O numero de pessoas é: "+nPessoas);
        System.out.println("A renda total é: "+rendTot);
        System.out.println("A renda perdida é: "+rendPerd);
        in.close();
    }
}