/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Pedido p1 = new Pedido(10, new Pix());
        Pedido p2 = new Pedido(10, new Credito());

        System.out.println(p1.getValorTotal());
        System.out.println(p2.getValorTotal());


        
        Pedido p3 = new Pedido(100);

        System.out.println(p3.valorTotal(new Pix()));
        System.out.println(p3.valorTotal(new Credito()));
    }
}