package calculadora;

public class Calculadora {
    
    double cache;
    double memoria;

    public void salvarMemoria(){
        memoria = cache;
    }

    public double soma(double a, double b){
        cache = a+b;
        return cache;
    }

    public double dividir(double a, double b){
        cache = a/b;
        return cache;
    }

    public double multiplica(double a){
        cache *= a;
        return cache;
    }
    public double multiplica(double  a, double b){
        cache = a*b; 
        return cache;
    }

    public double estado(){
        return cache;
    }

    public double memoria(){
        return memoria;
    }

}
