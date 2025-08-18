package Banco;

public class Main {
    public static void main(String[] args) {
        
        Cliente c = new Cliente("cliente1","53123456","email@email.com");

        Conta cont = new Conta(c);

        Cliente c2 = new Cliente("cliente2","53123458","email2@email.com");

        Conta cont2 = new Conta(c2);

        System.out.println(cont);
        System.out.println(cont2);

        cont.depositar(100);
        cont2.depositar(50);
        cont.transferir(cont2, 20);
        cont2.transferir(cont, 30);
        cont.sacar(100);
        cont2.sacar(20);

        for (Transacao t : cont.historico()) {
            System.out.println("/////////////////////");
            System.out.println(t.data);
            System.out.println(t.tipo);
            System.out.println(t.getValor());
        }

        for (Transacao t : cont2.historico()) {
            System.out.println("//////////////////////");
            System.out.println(t.data);
            System.out.println(t.tipo);
            System.out.println(t.getValor());
        }

        System.out.println(cont.saldo());
        System.out.println(cont2.saldo());
        
    }
}
