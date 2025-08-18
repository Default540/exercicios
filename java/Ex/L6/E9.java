package L6;

public class E9 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int milhar = i/1000;
            int res = i%1000;
            int centena = res/100;
            res = res%100;

            int n = milhar*10+centena;

            n += res;
            
            if (n*n == i) {
                System.out.println(i);
            }
        }
    }
}
