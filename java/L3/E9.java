package L3;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Colque duas notas e a nota da avaliação optativa (se não tiver coloque -1):");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float no = in.nextFloat();
        float media;
        if (no != -1) {
            media = (n1+n2+no)/3;
        }else{
            media = (n1+n2)/2;
        }

        String res;
        if (media >= 6) {
            res = "Aprovado";
        } else if(media >= 3) {
            res = "Em recuperação";
        }else{
            res = "Reprovado";
        }
        System.out.printf("A media é %.2f.\nVocê foi: %s\n",media,res);
        in.close();
    }
}
