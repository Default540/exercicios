public class App {
  public static void main(String args[]) {

    System.out.println(Texto.substr("modular", 1, 6)); // odula
    System.out.println(Texto.substr("modular", 2, 5)); // dul
    System.out.println(Texto.substr("modular", 2)); // dular
    System.out.println(Texto.substr("modular", -5, -2)); // dul
    System.out.println(Texto.substr("modular", -15, 2)); // mo
    System.out.println(Texto.substr("modular", -2)); // ar
    System.out.println(Texto.substr("modular", -6, 4)); // odu
    System.out.println(Texto.substr("modular", 8, 10)); // ""
    System.out.println(Texto.substr("modular", 4, 20)); // lar
    System.out.println(Texto.substr("modular", 4, 1)); // ""

    System.out.println(Texto.substr("programacao modular", 0, 4, 12, 15)); // progmod
    System.out.println(Texto.substr("programacao modular", 0, 4, 12)); // progmodular
    System.out.println(Texto.substr("programacao modular", 0, 3, 6, 9, 12, 15));
  }

}
