using System.Text;

var id = Guid.NewGuid(); //hash unico
id.ToString();
id = new Guid("db834030-0d71-46b4-accd-a046f3b47795");

System.Console.WriteLine(id.ToString()[..8]); //tudo até o 8// [8..] tudo apos o 8

var preco = 10.5;
var text = string.Format("O preço \né {0}",preco);
text = @$"O preço 
é {preco}"; //@ para quebra de linha e caracter especial (\n) e $ para formatação
System.Console.WriteLine(text);

System.Console.WriteLine(text.CompareTo($"O preço \né {preco}"));
System.Console.WriteLine(text.Contains("Preço", StringComparison.OrdinalIgnoreCase)); //case sensitive

text.StartsWith("O PREÇO", StringComparison.OrdinalIgnoreCase);
System.Console.WriteLine(text.EndsWith("10,5"));
text.Equals("O PreÇo É 10,5"); //true
System.Console.WriteLine(text.IndexOf('ç'));
text.LastIndexOf('o'); // 6
text.ToUpper();
text.ToLower();
System.Console.WriteLine(text.Insert(0, "/// "));
System.Console.WriteLine(text.Replace("é","/*é*/"));
var listOfWords = text.Split(" ");
System.Console.WriteLine(listOfWords[0]);
System.Console.WriteLine("   f o d a  ".Trim()); //remove os espaços no inicio e fim
var texto = new StringBuilder();
texto.Append(text);
texto.Append(" /* texto */");
System.Console.WriteLine(texto);