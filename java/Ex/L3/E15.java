package L3;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Escreva os valores de três lados de um triangulo:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String mensagem = "";

        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            if ((a==b) && (b==c)) {
                mensagem = "Triângulo Equilátero";
            }else if ((a==b) || (b==c) || (a==c)) {
                mensagem = "Triângulo Isósceles";
            }else{
                mensagem = "Triângulo Escaleno";
            }
        }else{
            System.out.println("Não é possivel formar um triangulo: ");
        }

        System.out.println(mensagem);
        in.close();
        
        /**
         *  1,2,3 = não é possivel formar um triangulo
         *  3,4,5 = triangulo escaleno
         *  2,2,4 = não é possivel criar um triangulo
         *  4,4,4 = triangulo equilatero
         *  5,3,3 = triangulo isoceles
         */
        
    }
}
