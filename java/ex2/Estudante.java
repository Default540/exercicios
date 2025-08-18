import java.time.LocalDate;

class Estudante {
    int matricula;
    String nome;
    LocalDate dataNascimento;
    Genero genero;    

    Estudante (int matricula, String nome, LocalDate dataNascimento, Genero genero){
        try {
            this.matricula = matricula;
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.genero = genero;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
