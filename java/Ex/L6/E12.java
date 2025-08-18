package L6;

public class E12 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            int nSoma = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0) {
                    nSoma+=j;
                }
            }
            if (i == nSoma) {
                System.out.printf("%d é um numero perfeito!\n",i);
            }    
        }
    }
}
