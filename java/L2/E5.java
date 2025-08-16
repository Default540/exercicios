package L2;
import java.util.Scanner;

public class E5{
    public static void main(String [] args){
        final Scanner in = new Scanner(System.in);

        System.out.println("Coloque um numero:");
        float n1 = in.nextFloat();

        System.out.println("Coloque um numero denominador:");
        float n2 = in.nextFloat();
        in.close();
        if(n2 == 0){
            System.out.println("Erro: não é possivel dividir por zero");
            return;
        }

        float res = n1/n2;

        System.out.printf("a divisão de %.2f por %.2f é: %.2f\n",n1,n2,res);

        in.close();
    }
}