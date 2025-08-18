public class Credito implements IMetodoPagamento {
    @Override
    public float valorTotal(float valor) {
        return valor+(valor*0.05f);
    }
}
