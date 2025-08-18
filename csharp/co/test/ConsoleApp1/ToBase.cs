static internal class ToBase
{

    private static readonly string[] apha = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q","R", "S", "T", "U", "V", "W", "X", "Y", "Z"];
    static internal string ConvertToAphaNumeric(int value, int baseNum){

        string res = "";


 
        int rest;
        int inteiro = value;
        do
        {
            rest = inteiro%baseNum;
            inteiro /= baseNum;

            
            res += Convert(rest);

        } while (inteiro > 0);

        
        res = Reverse(res);

        return res;
    }

    static internal string ConvertToAphaNumeric(long value, int baseNum){

        string res = "";


 
        long rest;
        long inteiro = value;
        do
        {
            rest = inteiro%baseNum;
            inteiro /= baseNum;

            
            res += Convert(rest);

        } while (inteiro > 0);

        
        res = Reverse(res);

        return res;
    }
    static internal string ConvertToAphaNumeric(ulong value, ulong baseNum){

        string res = "";



        ulong rest;
        ulong inteiro = value;
        do
        {
            rest = inteiro%baseNum;
            inteiro /= baseNum;

            
            res += Convert(rest);
            
        } while (inteiro > 0);

        
        res = Reverse(res);

        return res;
    }
    private static string Convert(int n){
        if (n < 10) return n.ToString();
        
        n -= 10;

        return apha[n];
    }

    private static string Convert(long n){
        if (n < 10) return n.ToString();
        
        n -= 10;

        return apha[n];
    }
    private static string Convert(ulong n){
        if (n < 10) return n.ToString();
        
        n -= 10;

        return apha[n];
    }

    private static string Reverse(string s){
        
        string res = "";

        for (int i = s.Length-1; i >= 0; i--)
        {
            res += s[i];
        }
        return res;
    }
}