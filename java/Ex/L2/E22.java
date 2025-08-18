package L2;

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o numero da sua conta, saldo, credito e debito: ");

        int numeroConta = in.nextInt();
        float saldo = in.nextFloat();
        float credito = in.nextFloat();
        float debito = in.nextFloat();

        float saldoAtual = saldo - debito+credito;

        if (saldoAtual >= 0) {
            System.out.println("Saldo positivo!");
        }else System.out.println("Saldo negativo!");

        System.out.printf("Saldo atual da conta de numero %d => %.2f\n",numeroConta,saldoAtual);
        in.close();
    }
}
