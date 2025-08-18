import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> partes = Texto.split("texto de exemplo");
        
        System.out.println(partes.size());

        System.out.println(partes);
    }
}
