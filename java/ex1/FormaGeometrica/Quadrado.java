public class Quadrado extends Retangulo{
    
    Quadrado(String nome, double base){
        super(nome, base, base);
    }

    @Override
    public double calcularArea() {
        return this.base*this.base;
    }
}
