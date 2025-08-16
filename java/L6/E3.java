package L6;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int abaixoDoPeso = 0;
        int pesoNormal = 0;
        int sobrepeso = 0;
        int obesidade1 = 0;
        int obesidade2 = 0;
        int obesidade3 = 0;

        while (true) {
            float altura = in.nextFloat();
            if (altura == 0) {
                break;
            }
            int peso = in.nextInt();
            float imc = peso/(altura*altura);

            if (imc < 18.5) {
                abaixoDoPeso++;
            }else if (imc < 25) {
                pesoNormal++;
            }else if (imc < 30) {
                sobrepeso++;
            }else if (imc < 35) {
                obesidade1++;
            }else if (imc < 40) {
                obesidade2++;
            }else{
                obesidade3++;
            }
        }
        System.out.printf("Abaixo do peso: %d\nPeso normal: %d\nSobrepeso: %d\nObesidade 1: %d\nObesidade 2: %d\nObesidade 3\n",abaixoDoPeso,pesoNormal,sobrepeso,obesidade1,obesidade2,obesidade3);
        in.close();
    }
}
