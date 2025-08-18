package L2;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        float salario =0;
        int prestaçoes =0;
        float emprestimo=0;

        while (true) {
            System.out.println("Qual o salario, a quantidade de prestaçoes e o valor do emprestimo:");
            salario = in.nextFloat();
            prestaçoes = in.nextInt();
            emprestimo = in.nextFloat();

            if (salario > 0 && prestaçoes > 0 && emprestimo > 0) {
                break;
            }else{
                System.out.println("O salario e a quantidade de prestações não podem ser 0 ou negativo!");
            }
        }

        final float porcent = 0.3f;
        float maxParcela = salario*porcent;
        float valorParcela = emprestimo/prestaçoes;

        if (valorParcela<=maxParcela) {
            System.out.println("O emprestimo pode ser realizado.");
        }else{
            System.out.println("O emprestimo não pode ser realizado.");
        }
        in.close();
    }
}
