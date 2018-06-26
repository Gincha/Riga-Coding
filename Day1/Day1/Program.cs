using System;

namespace Day1
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            int vesels = 4; // vesels skaitlis
            Console.WriteLine(vesels);
            vesels = 5;
            Console.WriteLine(vesels);
            /* vairaku rindu 
             * komentars.
             * punkts. 

            double komats = 5.6; // skaitlis ar komatu
            char simbols = '7';

            string virkne = "abc";

            virkne = virkne + simbols; // var kombinet abus. Ta var darit.
            Console.WriteLine(virkne);

            Console.WriteLine("Ievadi kaut ko: ");  // prasa ierakstit kaut ko
            string virkne 2 = Console.ReadLine();
            Console.WriteLine(virkne2);         // parada ko ierakstija
            */

            Console.WriteLine("Ka tevi sauc? ");
            string vards = Console.ReadLine();
            Console.WriteLine("Kads gads ir tagad?");
            string gadstgd = Console.ReadLine();
            Console.WriteLine("Kura gada Tu esi dzimis?");
            string dzgads = Console.ReadLine();

            int gadsnow = Convert.ToInt16(gadstgd);
            int dzimsgad = Convert.ToInt16(dzgads);

            int vecums = gadsnow - dzimsgad;

            Console.WriteLine("Tevi sauc " + vards + " un Tev ir " + vecums + "gadi");
            Console.ReadLine();



            /*
            string Ieraksts = Console.ReadLine();
            int rezultats = Convert.ToInt16(Ieraksts);
            Console.WriteLine(rezultats);

            rezultats = rezultats + 6;
            //Console.WriteLine("Sveiks " + Ieraksts);

            Console.WriteLine(rezultats);
            Console.ReadLine(); */
        }
    }
}
