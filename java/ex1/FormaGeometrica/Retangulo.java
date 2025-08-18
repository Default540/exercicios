public class Retangulo extends Forma{
    protected double base;
    private double altura;

    Retangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }
}
