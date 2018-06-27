using System;

namespace Day_3
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            string vards, uzvards;                   // deklare mainigo neiedodot vertibu
            Console.WriteLine("Ludzu ievadiet savu vardu");
            vards = Console.ReadLine();                         // mainigais darbosies tikai Main funkcijas ietvaros
            Console.WriteLine("Ludzu ievadiet savu uzvardu");
            uzvards = Console.ReadLine();                       // mainigais darbosies tikai funkcijas ietvaros

            IzvaditSveicienu(vards, uzvards);
            Console.ReadLine();
            */


            /*

            RinkaLinija();
            Console.ReadLine();
            */

            Console.WriteLine("Mans skaitlis ir __ ");
            Skaitlis();

            Console.ReadLine();


        }
        /*
        static void IzvaditSveicienu(string a, string b)        // uztaisa 2 parametrus funkcijai
        {
            Console.WriteLine("Sveiki " + a + " " + b + ", Prieks Tevi redzet");
        }
            */

            /*
        static void RinkaLinija()
        {
            double pi = 3.14;

            Console.WriteLine("Ludzu ievadiet rinka linijas radiusu");
            String radiusString = Console.ReadLine();
            double radiussDouble = Convert.ToDouble(radiusString);

            double diametrs = 2 * radiussDouble;
            double garums = 2 * pi * radiussDouble;

            Console.WriteLine("Rinka linijas diametrs ir " + diametrs);
            Console.WriteLine("Rinka linijas garums ir " + garums);
           } */
            
        static void Skaitlis()
        {
            Console.WriteLine("Ludzu ievadiet skaitli, kuru pievienot beigas ");
            String skaitlis = Console.ReadLine();
            double ievade = Convert.ToDouble(skaitlis);

            Console.WriteLine("Mans skaitlis ir " + ievade);

        }
    }
}
