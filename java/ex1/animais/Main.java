import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Gato m = new Gato();

        c.fazSom();
        m.fazSom();

        List<IEmitirSom> animais = new ArrayList<>();

        for (IEmitirSom animal : animais) {
            animal.fazSom();
            System.out.println(animal.getClass().getName());
        }
    }
}