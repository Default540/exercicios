package caneta;
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "adw";

        System.out.println(c1.tampada);
        
        c1.tampar();

        System.out.println(c1.tampada);
    }
}
