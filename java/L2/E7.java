package L2;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu salario por hora, o quanto de horas você trabalha por mês e a porcentagem de imposto?");
        float salarioPorHora = in.nextFloat();
        int nHorasPorMes = in.nextInt();
        int imposto = in.nextInt();

        float totalSalarioPorMes = salarioPorHora*nHorasPorMes;
        float totalSalarioPorSemana = salarioPorHora*7;
        float salarioLiquido = totalSalarioPorMes-(totalSalarioPorMes*imposto/100);

        System.out.printf("Salario total por mês: %.2f\nSalario total por semana: %.2f\nSalario liquido: %.2f",totalSalarioPorMes,totalSalarioPorSemana,salarioLiquido);

        in.close();
    }
}
