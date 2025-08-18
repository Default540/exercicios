/**
 * Pedido
 */
public class Pedido{

    private float valorTotal;

    Pedido(float valor, IMetodoPagamento mp){
        this.valorTotal = mp.valorTotal(valor);
    }

    Pedido(float valor){
        valorTotal = valor;
    }

    public float valorTotal(IMetodoPagamento mp){
        return mp.valorTotal(this.valorTotal);
    }

    public float getValorTotal() {
        return valorTotal;
    }
}