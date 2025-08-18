import java.util.ArrayList;

public class Texto {
    public static String substr(String txt, int... txtleng) {
        String res = "";
        int totalPares = txtleng.length;

        for (int i = 0; i < totalPares; i=i+2) {
            int inicio = txtleng[i] | 0;
            int fim;
    
            fim = txtleng.length %2 != 0 && i+1 == totalPares?fim = txt.length():txtleng[i+1];

            //if(txtleng.length %2 != 0 && i+1 == totalPares)fim = txt.length();
            //else fim = txtleng[i+1];

            if(inicio + txt.length() < 0) inicio = 0;
            else if (inicio < 0) inicio = txt.length() + inicio;
    
            if(fim < 0) fim = txt.length() + fim;
    
            if (inicio >= txt.length()) return "";
    
            if (fim > txt.length()) fim = txt.length();
    
            if(inicio >= fim) return "";
    
            for (int c = inicio; c < fim; c++) {
                res += txt.charAt(c);
            }
        }

        return res;
    }
    static char primeiraLetra(String str){
        if (str == null || str.length() == 0) {
            return '\0';
        }
        //char res = str.toCharArray()[0];
        return str.charAt(0);
    }

    static char ultimaLetra(String str){
        if (str == null || str.length() == 0) {
            return '\0';
        }

        return str.charAt(str.length()-1);
    }

    static ArrayList<String> split(String texto){
        
        char[] chtx = texto.toCharArray();        
        
        ArrayList<String> res = new ArrayList<String>();
        
        String word = "";
        
        for (int i = 0; i < chtx.length; i++) {
            
            if (chtx[i] == ' ') {
                
                res.add(word);
                
                word = "";
                
            }else word += chtx[i];
                
        }

        res.add(word);
        
        return res;
    }
}
