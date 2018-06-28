using System;

namespace Day4
{
    class Program
    {
        static void Main(string[] args)
        {
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
        }
    }
}
