public class Gato implements IEmitirSom {
    
    private String nome;
    
    Gato(){
        this.nome = "Gato";
    }

    @Override
    public void fazSom() {
        System.out.println("O " + this.getNome() +" faz Miau Miau");
    }

    public String getNome() {
        return nome;
    }
}
