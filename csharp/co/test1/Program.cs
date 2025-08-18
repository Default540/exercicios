Console.WriteLine("Hello, World!");
Test gr = new();
gr.Teste();
Test.Test1();


object o = new object();
o = "awd";

System.Console.WriteLine(o);

int? nul = null;
System.Console.WriteLine(nul);

char f = '\0';

System.Console.WriteLine(f);



StructTest structTest = new StructTest(4, Estado.es, "awd");
var structTest2 = new StructTest(2, Estado.sp, "ffff");

structTest.id = 3;


System.Console.WriteLine((int)structTest2.estado);
