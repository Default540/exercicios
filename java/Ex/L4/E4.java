package L4;

import java.util.Scanner;

/**
 * Escreva um programa que apresente quatro opções: (a) consulta saldo, (b)
 * saque e
 * (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou
 * depósito o
 * valor do saldo deve ser atualizado.
 */

public class E4 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        float saldo = 0;

        while (true) {
            System.out.println("(a) Consulta saldo\n(b) Saque\n(c) Deposito\n(d) Sair");
            char input = in.next().toLowerCase().charAt(0);
            if (input == 'a') {
                System.out.printf("Seu saldo é R$%.2f\n", saldo);
            }else if (input == 'b') {
                System.out.println("Quanto deseja sacar:");
                float saque = in.nextFloat();

                if (saldo-saque < 0) {
                    System.out.println("Saldo insuficiente!\nSaldo atual: "+saldo);
                }else{
                    saldo-=saque;
                    System.out.println("Saque concluido!\nSaldo atual: "+saldo);
                }

            }else if (input == 'c') {
                System.out.println("O quanto deseja depositar:");
                float deposito = in.nextFloat();
                if (deposito <= 0) {
                    System.out.println("Não é possivel depositar esse valor!");
                }else{
                    saldo+=deposito;
                    System.out.println("Deposito concluido!\nSaldo atual: "+saldo);
                }
            }else if(input == 'd'){
                break;
            }else{
                System.out.println("Letra invalida!");
            }
        }
        in.close();
    }
}
