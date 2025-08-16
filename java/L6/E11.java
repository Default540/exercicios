package L6;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int lin = in.nextInt();
        int col = in.nextInt();
        String txt = " ";
        
        for (int i = 0; i < col; i++) {
            txt += "-";    
        }
        
        txt += "\n";

        for (int i = 0; i < lin; i++) {
            txt += "|";    
            for (int j = 0; j < col; j++) {
                txt += " ";
            }
            txt += "|\n";
        }

        txt+= " ";
        
        for (int i = 0; i < col; i++) {
            txt += "-";
        }

        System.out.println(txt);
        in.close();
    }
}
