package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double resultado = calc.multiplica(5,3); //15
        System.out.println(resultado);

        calc.salvarMemoria(); //15

        calc.soma(10, 2);   // 20

        calc.estado();   // 20

        calc.memoria();  // 40

        calc.dividir(calc.memoria(), 10);    // 4

        calc.multiplica(3); // vai pegar o estado
                        // 4 * 3 = 12

    }
}
