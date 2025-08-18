/**
 * Forma
 */
abstract class Forma {
    protected String nome;
    
    Forma(String nome){
        this.nome = nome;
    }
    abstract double calcularArea();
    
}