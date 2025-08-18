internal class Program
{
    private static void Main(string[] args)
    {
        Console.Clear();
        Console.WriteLine("Coloque um valor:");
        float v1 = float.Parse(Console.ReadLine());

        Console.Clear();
        Console.WriteLine("Coloque outro valor:");
        float v2 = float.Parse(Console.ReadLine());

        Console.Clear();
        Console.WriteLine("Coloque o calculo:");
        string? calc = Console.ReadLine();

        float res = 0;

        bool allRight;
        do
        {
            allRight = true;
            switch (calc)
            {
                case "soma":
                    res = (float)(v1 + v2);
                    break;
                case "subtracao":
                    res = (float)(v1 - v2);
                    break;
                case "divisao":
                    res = (float)(v1 / v2);
                    break;
                case "multiplicacao":
                    res = (float)(v1 * v2);
                    break;
                case "sair":
                    System.Environment.Exit(0); 
                    break;
                default:
                    Console.Clear();
                    Console.WriteLine("Tente novamente:");
                    calc = Console.ReadLine();
                    allRight = false;
                    break;
            }

        } while (!allRight);


        //Console.WriteLine("Resultado => {0}", res);
        Console.WriteLine($"Resultado => {res}");
        Console.ReadKey();
    }
}