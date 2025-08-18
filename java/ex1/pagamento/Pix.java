public class Pix implements IMetodoPagamento{
    @Override
    public float valorTotal(float valor) {
        return valor-(valor*0.15f);
    }
}
