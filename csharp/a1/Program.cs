// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");

// tipagem estatica
// fortemente tipada


int? x = 3;

String y = "5";

System.Console.WriteLine(y is string);
System.Console.WriteLine(x+y); //conversão para string

var d = 5.4; // d é double

System.Console.WriteLine(d.GetType());

d = 4.5;

int? a = null; // ? indica que pode receber null

if (!a.HasValue)
{
    a = 2;
}

int h; //declarar
h = 2; //atribuir
System.Console.WriteLine(h);


byte tbyte = 255;
short tshort = 2_000;
int tint = 5_325_355;
long tlong = 2_355_555_555_555_555_555;
bool tbool = true;
float tfloat = 2.244f;
double tdouble = 214124;
char tchar = '篆';
string tstring = "adafwá*"; //parece primitivo
System.Console.WriteLine(tstring[4]);
uint tInteiroSemSinal = 5; //ou positivo
ulong tlongSemSinal = 24;
