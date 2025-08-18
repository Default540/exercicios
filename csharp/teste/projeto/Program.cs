using Util;

Console.WriteLine("Hello, World!");

var test1 = new int[]{2,4,5};
int[] test2 = { 2, 4, 5 };


int[] arrI = [12,34,56,12,67];
string[] arrS = ["js","java","c#","python"];

System.Console.WriteLine(Util.Arrays.first(arrI));

try{

    System.Console.WriteLine(Arrays.first([]));
    
}
catch (System.Exception e){
    Console.ForegroundColor = ConsoleColor.Red;
    System.Console.WriteLine(e.Message);
    Console.ForegroundColor = ConsoleColor.White;
}
var red = "red";
System.Console.WriteLine("test {0}",red);

string s = "teste";
System.Console.WriteLine(Text.substr(s,1));