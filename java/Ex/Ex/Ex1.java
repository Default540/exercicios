package Ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Coloque o comprimento, altura e largura:");

        final float areaCaixa = 1.5f;
        float c = in.nextFloat();
        float a = in.nextFloat();
        float l = in.nextFloat();

        float areaCozinha = 2*c*a+2*a*l; //paredes

        int totalCaixas = (int)(areaCozinha/areaCaixa);
        float resto = areaCozinha%areaCaixa;

        if (resto != 0) {
            totalCaixas = totalCaixas+1;
        }
        System.out.printf("O total de caixas que é possivel colocar é %d\nresto: %f\n",totalCaixas,resto);
        in.close();
    }
}
