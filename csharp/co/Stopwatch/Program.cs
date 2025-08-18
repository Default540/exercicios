internal class Program
{
    private static void Main(string[] args)
    {
        Menu();

    }

    static void Menu()
    {
        Console.Clear();
        System.Console.WriteLine("S = Segundos => 10s = 10 segundos");
        System.Console.WriteLine("M = Minutos => 10m = 10 minutos");
        System.Console.WriteLine("0 = Sair");
        System.Console.WriteLine("Quanto tempo deseja contar?");
        string? option = Console.ReadLine();
 
        while (true)
        {
            if (option == null || option.Length == 0)
            {
                option = Console.ReadLine();
            }
            else
            {
                option.ToLower();
                
                char typeTime = char.Parse(option.Substring(option.Length-1,1));
                if (typeTime == '0') System.Environment.Exit(0);
                
                int time = int.Parse(option.Substring(0, option.Length-1));
                if (time == 0) System.Environment.Exit(0);

                PreStart();
                Start(typeTime, time);
                break;
            }
        }
        
    }

    static void PreStart(){
        Console.Clear();
        System.Console.WriteLine("Ready...");
        Thread.Sleep(1000);
        System.Console.WriteLine("Set...");
        Thread.Sleep(1000);
        System.Console.WriteLine("Go...");
        Thread.Sleep(2500);
    }
    static void Start(char typeTime, int time)
    {
        int mult = 1;
        if (typeTime == 'm') mult = 60;
        
        

        time *= mult;
        int currentTime = 0;

        while (currentTime <= time)
        {
            Console.Clear();
            System.Console.WriteLine(currentTime);
            Thread.Sleep(1000);
            currentTime++;
        }
    }
}