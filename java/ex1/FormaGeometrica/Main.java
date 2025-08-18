public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Circulo", 10);

        System.out.println(c.calcularArea());

        Retangulo r = new Retangulo("Retangulo", 10, 20);

        System.out.println(r.calcularArea());

        Quadrado q = new Quadrado("Quadrado", 10);

        System.out.println(q.calcularArea());

    }
}
