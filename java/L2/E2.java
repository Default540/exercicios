package L2;
import java.util.Scanner;
public class E2{
    public static void main(String [] args){
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva a base do retangulo:");
        float b = in.nextFloat();
        System.out.println("Escreva a altura do retangulo:");
        float a = in.nextFloat();

        float area = a*b;
        float perim = a*2+b*2;

        System.out.printf("A area do retangulo é %.2f e o perimetro é %.2f\n",area,perim);
        in.close();
    }
}