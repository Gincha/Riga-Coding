using System;

namespace Day7
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Izveleties uzdevumu- 1 vai 2");
            string choice = Console.ReadLine();
            int ch = Convert.ToInt16(choice);

            Praktiskie prak = new Praktiskie(); //Klases objekts

            switch (ch)
            {
                case 1:
                    prak.Pirmais();
                    break;
                case 2:
                    prak.Otrais();
                    break;
                default:
                    Console.WriteLine("Nepareiza ievade!");
                    break;
            }

            Console.ReadLine();
        }
    }
}
