using System;

namespace Day4
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            Uzdevums rezultats = new Uzdevums();
            Zarosanas zari = new Zarosanas();

            Console.WriteLine("Ludzu ievadiet skaitli lai izveletos funkciju");
            String skaitlis = Console.ReadLine();
            int cipars = Convert.ToInt16(skaitlis);

            if (cipars < 5)
            {
                Console.WriteLine("izpildas funkcija Udevums");
                rezultats.Beigas();
            }
            else
            {
                Console.WriteLine("Izpildas funkcija zari");
                zari.LielaksVaiMazaks();
            }

            Console.ReadLine();
            */


            /*
            Console.writeLine("Lai izsauktu 1. funkciju rakstam 1, lai otro - 2");
            string input = Console.ReadLine();                  // if`s ar stringu nevis ciparu

            if (input == "1")                       // stringu jaliek pedinas
            {
                rezultats.Beigas();
            }
            else
            {
                if (input == "2")
                {
                    zari.LielaksVaiMazaks();
                }
                else
                {
                    Console.WriteLine("Nav pareiza ievade");
                }
            }       
                    

            switch (input)
            {
                case "1":
                    rezultats.Beigas();
                    break;
                case "2":
                    zari.LielaksVaiMazaks();
                    break;
                default:                                    // strada ka else -> visi parejie gadijumi kad nav doti
                    Console.WriteLine("Nav pareiza ievade");
                    break;                              // katram case beigas jaraksta break OBLIGATI
            }
            */

            Zarosanas izvele = new Zarosanas();

            Console.WriteLine("Nospiediet 1 lai palaistu if funkciju, nospiediet 2 lai palaistu ArCase funkciju");
            String ievada = Console.ReadLine();
            if (ievada == "1")
            {
                izvele.ArIf();
            }
            else
            {
                if (ievada == "2")
                {
                    izvele.ArCase();
                }
                else
                {
                    Console.WriteLine("Nepareiza ievade");
                }
            }
            

            Console.ReadLine();
        }
    }
}
