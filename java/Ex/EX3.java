package Ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor da primeira, segunda e terceira nota em ordem crescente:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        System.out.println("O quanto você quer sacar: ");
        int sacar = in.nextInt();

        int quantN3 = sacar/n3;
        int quantN2 = (sacar-quantN3*n3)/n2;
        int quantN1 = (sacar-quantN3*n3-quantN2*n2)/n1;

        if ( (sacar-quantN3*n3-quantN2*n2) % n1 != 0) {
            System.out.println("Não é possivel dividir");
        }else{
            System.out.printf("É preciso tirar:\n%d notas de %d\n%d notas de %d\n%d notas de %d\n",quantN3,n3,quantN2,n2,quantN1,n1);
        }
        in.close();
    }
}
