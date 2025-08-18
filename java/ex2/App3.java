import java.time.LocalDate;
/**
 * app
 */

class App {   
    public static void main(String[] args) {
        var d = LocalDate.now();
        System.out.println(d);
        var s = App.class;
        s.getName();
        //var p = 1;
        Integer p = 7;
        if (p == 7) {
            
        }
        var c = LocalDate.now();
        
        System.out.println(c.getClass());

        char[] i = {105,106};
        System.out.println(i);
        System.out.println(Texto.primeiraLetra("awd"));
        System.out.println("/////");
        System.out.println(Texto.ultimaLetra("TADS"));
        System.out.println(Texto.ultimaLetra("modulo"));
        System.out.println(Texto.ultimaLetra(null));
        System.out.println(Texto.ultimaLetra(""));
        
    }

    
}