public class Circulo extends Forma{
    
    private double raio;

    Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
