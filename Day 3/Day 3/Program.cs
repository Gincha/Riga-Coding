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

            /*
            Console.WriteLine("Mans skaitlis ir __ ");
            Skaitlis();

            Console.ReadLine();
            */

            /*
            Rezultats();
            Console.ReadLine();
            */

            /*
            JaunaKlase objekts1 = new JaunaKlase();         // uztaisa jaunu objektu un izsauc t.s. konstruktoru
            JaunaKlase objekts2 = new JaunaKlase();

            int vertiba = objekts1.Saskaitit(8, 5);
            objekts1.globals = 5 + 5;                   /* ja izmaina globals vertibu objektam 1, tad 
                                                                objektam 2 vertiba nemainas
                                                                */
            /*
            Console.WriteLine(objekts1.globals);
            Console.WriteLine(objekts2.globals);
            Console.ReadLine();
            */

            /*
            Matematika obj = new Matematika();


            int saskaitit = obj.Saskaitit12(5,7);           // abiem nevajag citu objektu, var stradat no viena
            int atnemt = obj.Atnemt(7, 20);

            Console.WriteLine(saskaitit);
            Console.WriteLine(atnemt);

            Console.ReadLine();
            */

            RinkaLinija jauns = new RinkaLinija();

            jauns.Rinkis();

            
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

        /*
    static void Skaitlis()
    {
        Console.WriteLine("Ludzu ievadiet skaitli, kuru pievienot beigas ");
        String skaitlis = Console.ReadLine();
        double ievade = Convert.ToDouble(skaitlis);

        Console.WriteLine("Mans skaitlis ir " + ievade);

    }   */

            /*
        static void Rezultats()
        {
            double paterins, cena, distance;

            Console.WriteLine("Ludzu ievadiet degvielas paterinu (litros) uz 100 kilometriem ");
            String degviela = Console.ReadLine();
            paterins = Convert.ToDouble(degviela);

            Console.WriteLine("Ludzu ievadiet degvielas cenu (eur) par 1 litru ");
            String deg = Console.ReadLine();
            cena = Convert.ToDouble(deg);

            Console.WriteLine("Ludzu ievadiet distances garumu ");
            String dist = Console.ReadLine();
            distance = Convert.ToDouble(dist);

            double izmantotaDegviela = distance * (paterins/100);

            double izmaksa = izmantotaDegviela * cena;

            Console.WriteLine("Nobraukt " + distance + "km izmaksas " + izmaksa + " eur.");

        }
            */

    }
}
