package Ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva um valor de 4 digitos:");
        int n = in.nextInt();


        int milhar = n/1000;
        int resto = n%1000;

        /* int centena = (n-1000*milhar)/100;

        int dezena = (n-milhar*1000-centena*100)/10;

        int unidade = (n-milhar*1000-centena*100-dezena*10); */

        
        int centena = resto/100;
        resto = resto%100;
        
        int dezena = resto/10;
        resto = resto%10;

        int unidade = resto/1;


        int inverso = unidade*1000+dezena*100+centena*10+milhar;

        System.out.println(n+" => "+inverso);
        in.close();
    }
}
