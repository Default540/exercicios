import java.time.LocalDate;
import java.util.HashMap;

public class App2 {
    public static void main(String[] args) {
        HashMap academico = new HashMap<Integer,String>();
        academico.put(1314, "awdawd");
        
        var e1 = new Estudante(1414525,"ASF",LocalDate.of(2000, 3, 14),Genero.MASCULINO); 

        Mochinho.buscar(14);
        Mochinho.salvar(e1.matricula,e1);
    }
}
