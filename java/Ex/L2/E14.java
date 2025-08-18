package L2;

//import java.util.Calendar;
import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Qual ano você naceu?");
        int ano = in.nextInt();

        System.out.println("Qual o ano atual?");
        int agora = in.nextInt();
        int idade = agora - ano;
        
        /* Calendar agora = Calendar.getInstance();
        Calendar anoNc = Calendar.getInstance();
        anoNc.set(ano, 1,1);
        int idade = agora.get(Calendar.YEAR)-anoNc.get(Calendar.YEAR); */


        if (idade >= 18) {
            System.out.println("Você pode votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }
        in.close();
    }
}
