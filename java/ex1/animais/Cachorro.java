public class Cachorro implements IEmitirSom {

    private String nome;
    
    Cachorro(){
        this.nome = "Cachorro";
    }


    @Override
    public void fazSom() {
        
        System.out.println("O " + this.getNome() +" faz Au Au");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
