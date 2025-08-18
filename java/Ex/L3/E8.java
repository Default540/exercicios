package L3;

import java.util.Scanner; 

public class E8 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int user = 1234;
        final int pass = 9999;

        System.out.println("Qual o usuario: ");
        int inUser = in.nextInt();

        if (inUser == user) {
            System.out.println("Qual é a senha: ");
            int inPass = in.nextInt();

            if (inPass == pass) {
                System.out.println("Acesso permitido.");
            }else{
                System.out.println("Senha invalida.");
            }

        }else{
            System.out.println("Usuario invalido!");
        }
        in.close();
    }
}
