package L2;

import java.util.Calendar;
import java.util.Scanner;

public class E6{
    public static void main(String [] args){
        final Scanner in = new Scanner(System.in);

        System.out.println("Qual a sua data de nacimento? (dd/MM/YYYY)");
        String ntext = in.nextLine();

        String[]narrS = ntext.split("/");
        
        int[]narrI = new int[3];    
        
        for (int i = 0; i < narrS.length; i++) {
            narrI[i] =  Integer.parseInt(narrS[i]);
        }
        
        Calendar nasc = Calendar.getInstance();
        nasc.set(narrI[2],narrI[1],narrI[0]);
        Calendar agora = Calendar.getInstance();
        
        
        int anos = agora.get(Calendar.YEAR)-nasc.get(Calendar.YEAR);
        int meses = agora.get(Calendar.MONTH)-nasc.get(Calendar.MONTH);
        int dias = agora.get(Calendar.DAY_OF_MONTH)-nasc.get(Calendar.DAY_OF_MONTH);
        System.out.printf("Você viveu\nanos => %d\nmeses => %d\ndias => %d\n",anos,meses,dias);
        in.close();
    }
}