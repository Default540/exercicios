package L2;
import java.util.Scanner;

public class E4{
    public static void main(String[] args){
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque o primeiro numero:");
        int n1 = in.nextInt();
        System.out.println("Coloque o segundo numero:");
        int n2 = in.nextInt();
        if(n1 > n2){
            System.out.printf("O valor %d é maior que o valor %d\n",n1,n2);
        }else if(n2>n1){
            System.out.printf("O valor %d é maior que o valor %d\n",n2,n1);
        }else{
            System.out.printf("O valor %d é igual ao valor %d\n",n1,n2);
        }

        in.close();
    }
}