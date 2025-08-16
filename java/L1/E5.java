package L1;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("qual a temperatura em fahrenheit:");
        int temp = in.nextInt();
        temp = (5*(temp-32))/9;
        System.out.println("A temperatura em celcius é "+temp);
        in.close();
    }
}
