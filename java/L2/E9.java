package L2;

import java.util.Scanner;
import java.lang.Math;

public class E9 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o raio do circulo:");
        float raio = in.nextFloat();
        float diametro = raio*2;
        double area = Math.PI*Math.pow(raio,2);
        double circunferencia = 2*Math.PI*raio;

        System.out.printf("Raio => %.2f\nDiametro => %.2f\nArea => %.2f\nCircunferencia => %.2f\n",raio,diametro,area,circunferencia);
        in.close();
    }
}
