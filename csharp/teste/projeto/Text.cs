namespace Util{
    internal static class Text{
        internal static string substr(string str, int start, int end){

            if (start > str.Length){

                return "";

            }else if (end > str.Length) end = str.Length;
            
            string res = "";

            for (int i = start; i < end; i++){
                res += str[i];
            }

            return res;
        }
        internal static string substr(string str, int start){
            
            if (start > str.Length) return "";
            

            string res = "";

            for (int i = start; i < str.Length; i++)
            {
                res += str[i];
            }

            return res;
        }

        internal static ObjetoNaoEspecifico substr<ObjetoNaoEspecifico>(ObjetoNaoEspecifico a)
        {
            return a;
        }
    }
}