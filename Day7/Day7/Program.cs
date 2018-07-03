using System;

namespace Day7
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Izveleties uzdevumu- 1, 2 vai 3 vai 4 vai 5 vai 6");
            string choice = Console.ReadLine();
            int ch = Convert.ToInt16(choice);

            Praktiskie prak = new Praktiskie(); //Klases objekts

            Piemeri examples = new Piemeri();

            switch (ch)
            {
                case 1:
                    prak.Pirmais();
                    break;
                case 2:
                    prak.Otrais();
                    break;
                case 3:
                    examples.Kamer();
                    break;
                case 4:
                    examples.Darit();
                    break;
                case 5:
                    prak.Tresais();
                    break;
                case 6:
                    prak.Ceturtais();
                    break;
                default:
                    Console.WriteLine("Nepareiza ievade!");
                    break;
            }

            Console.ReadLine();
        }
    }
}
