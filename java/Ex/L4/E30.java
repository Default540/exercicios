package L4;

import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int m = 1;
        float s = 0;

        for (int i = 1; i <= n; i++) {
            int fatM = 1;

            for (int j = 1; j <= m; j++) {
                fatM*=j;
            }

            float res = (float)i/fatM;

            System.out.printf("%d/%d! => %d/%d => %f\n",i,m,i,fatM,res);
            m += 2;
            
            s+= res;    
        }

        System.out.printf("S = %f\n",s);

        in.close();
    }
}
