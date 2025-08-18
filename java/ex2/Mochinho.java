import java.util.HashMap;

class Mochinho {
    
    static HashMap<Integer,Estudante> hm = new HashMap<>(); 

    static boolean salvar(int pk, Estudante e){
        if (hm.containsKey(pk)) return false;
        hm.put(pk, e);
        return true;
    }

    static Estudante buscar(int pk){
        return hm.get(pk);
    }
}
