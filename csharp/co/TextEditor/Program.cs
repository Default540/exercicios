internal class Program
{
    private static void Main(string[] args)
    {
        Menu();
    }

    static void Menu()
    {

        while (true)
        {
            Console.Clear();
            System.Console.WriteLine("----------------------------");
            System.Console.WriteLine("Oque voce deseja fazer?");
            System.Console.WriteLine("1 - Abrir arquivo");
            System.Console.WriteLine("2 - Criar arquivo");
            System.Console.WriteLine("3 - Editar arquivo");
            System.Console.WriteLine("4 - Deletar arquivo");
            System.Console.WriteLine("0 - Sair");
            System.Console.WriteLine("----------------------------");
            short option = short.Parse(Console.ReadLine());

            switch (option)
            {
                case 0:
                    Console.Clear();
                    Environment.Exit(0);
                    break;
                case 1:
                    Console.Clear();
                    Open();
                    break;
                case 2:
                    Console.Clear();
                    Create();
                    break;
                case 3:
                    Console.Clear();
                    Edit();
                    break;
                case 4:
                    Console.Clear();
                    Delete();
                    break;
            }
        }
    }

    static void Delete(){
        System.Console.WriteLine("Qual arquivo?");
        string path = Path.GetFullPath(Console.ReadLine() + ".txt");
        
        if (File.Exists(path))
        {
            File.Delete(path);
        }else{
            System.Console.WriteLine("Arquivo não encontrado");
        }
    }
    static void Open()
    {
        System.Console.WriteLine("Qual arquivo?");
        string path = Path.GetFullPath(Console.ReadLine() + ".txt");

        Console.Clear();
        if (File.Exists(path))
        {
            using (var file = new StreamReader(path))
            {
                Console.WriteLine(file.ReadToEnd());
            }

            Console.ReadKey();
        }
        else
        {
            System.Console.WriteLine("Arquivo não encontrado!");
        }

    }

    static void Save(string path, string text)
    {
        if (File.Exists(path))
        {
            //abre e fecha o o objeto
            /* using (var writer = new StreamWriter(path))
            {
                writer.Write(text);
                writer.Close();
            } */

            var writer = new StreamWriter(path);
            writer.Write(text);
            writer.Close();
            

        }
        else
        {
            System.Console.WriteLine("Arquivo não encontrado!");
        }

    }
    static void Edit()
    {
        System.Console.WriteLine("Qual arquivo?");
        string name = Path.GetFullPath(Console.ReadLine() + ".txt");

        System.Console.WriteLine("Digite o texto do arquivo: (ESC para sair)");
        string text = "";

        do
        {

            text += Console.ReadLine();
            text += Environment.NewLine;
            //text += "\n";

        } while (Console.ReadKey().Key != ConsoleKey.Escape);

        Save(name, text);
    }
    static void Create()
    {
        Console.Clear();
        System.Console.WriteLine("Qual o nome do arquivo?");
        string name = Path.GetFullPath(Console.ReadLine() + ".txt");
        File.Create(name).Close();
    }
}