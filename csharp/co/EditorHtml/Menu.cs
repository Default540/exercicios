namespace EditorHtml
{
    public static class Menu
    {
        public static void Main(string[] args)
        {
            Show();
        }
        public static void Show()
        {
            Console.Clear();
            Console.BackgroundColor = ConsoleColor.Black;
            Console.ForegroundColor = ConsoleColor.Red;
            DrawScreen();
            WriteOptions();
            var option = short.Parse(Console.ReadLine());
            HandleMenuOption(option);
        }
        static void DrawScreen()
        {
            var x = 30;
            var y = 12;

            for (int i = 0; i <= y; i++)
            {
                for (int o = 0; o <= x; o++)
                {
                    if (i == 0 || i == y)
                    {
                        if (o == 0 || o == x)
                        {
                            Console.Write("+");
                        }
                        else
                        {
                            Console.Write("-");
                        }
                    }
                    else if(o == 0 || o == x)
                    {
                        System.Console.Write("|");
                    }else{

                        System.Console.Write(" ");
                    }
                }
                System.Console.WriteLine();
            }
        }
        public static void WriteOptions(){
            Console.SetCursorPosition(3,2);
            System.Console.WriteLine("Editor html");
            Console.SetCursorPosition(3,3);
            System.Console.WriteLine("==============");
            Console.SetCursorPosition(3,4);
            System.Console.WriteLine("Selecione uma opção abaixo");
            Console.SetCursorPosition(3,6);
            System.Console.WriteLine("1 - Novo Arquivo");
            Console.SetCursorPosition(3,7);
            System.Console.WriteLine("2 - Abrir");
            Console.SetCursorPosition(3,9);
            System.Console.WriteLine("0 - Sair");
            Console.SetCursorPosition(3,10);
            System.Console.Write("Opção: ");
        }
        public static void HandleMenuOption(short option){
            
            if (option == 1)
            {
                
            }else if (option == 2){
                

            }else if (option == 0){
                Console.Clear();
                Environment.Exit(0);
            }else{
                Show();
            }
        }

        public static void CreateNewHTMLFile(){
            Console.Clear();
            System.Console.WriteLine("Qual o nome do arquivo?");
            Console.ReadLine();
        }
    }
}