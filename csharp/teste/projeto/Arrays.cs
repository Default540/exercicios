namespace Util{
    internal static class Arrays{
        //metodo de arrays
        //retorna int
        //static impede a criação de objetos //new
        internal static int first(int[] array){

            if (array.Length > 0)return array[0];
            
            throw new Exception("ERRO");
            
        }
    }
}