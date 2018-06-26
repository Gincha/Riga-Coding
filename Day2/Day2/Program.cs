using System;

namespace Day2
{
    class Program
    {
        static void Main(string[] args)
        {
            /*NeatgriezVertibu();             // izsauc funkciju (function call)
            NeatgriezVertibu();
            ArParametriem(3,6);             //iekavas jaieraksta jebkadas 2 vertibas
            ArParametriem(1, 2);
            ArParametriem(8, -92);
            int atbilde = ArReturn(4, 9);   //izsauc funkciju, lai dabutu rezultatu
            Console.WriteLine(atbilde);
            Console.ReadLine();
            int a = AtgrSkaitli();
            Console.WriteLine(a);
            Console.ReadLine();
            */

            Console.WriteLine("Ierakstiet pirmo skaitli");
            string a = Console.ReadLine();
            int b = Convert.ToInt32(a);
            Console.WriteLine("Ierakstiet otro skaitli");
            string c = Console.ReadLine();
            int d = Convert.ToInt32(c);


            Console.WriteLine(b + "+" + d + "=" + Saskaitit(b, d));
            Console.WriteLine(b + "-" + d + "=" + Atnemt(b, d));

            Console.ReadLine();
        }

        /*
        static void NeatgriezVertibu()      //deklare funkciju un semikolu neliek bet raksta figuriekavas
        {
            Console.WriteLine("1. funkcija");            //funkcijas definicija un viss ir figuriekavas ieksa
            Console.WriteLine("Bez inputa un outputa");  //funkcijas definicija
            
        }

        static void ArParametriem(int a, int b)   // ir ieksa divi mainigie a un b bez vertibas un inputs var mainities
        {
            int result = a + b;                 //funkcijas definicija
            Console.WriteLine(result);          // lai dabutu vertibu erana te ir write line
        }

        static int ArReturn(int a, int b)
        {
            int result = a + b;                 //var but tas pats mainigais kas ieprieksh jo ir citaas iekavaas
            return result;                     // jo ir lokals mainigais -> pieklust tikai funkcijas robezas
                                            // lai dabutu vertibu ekrana bus jaraksta vel writeLine
                                            
        }       
        static int AtgrSkaitli ()
        {
            
            Console.WriteLine("Ierakstiet int tipa skaitli");
            string a = Console.ReadLine();
            int b = Convert.ToInt32(a);
            return b;

        } */

        static int Saskaitit(int b, int d)
        {
            int result = b + d;
            return result;
        }

        static int Atnemt (int b, int d)
        {
            int result = b - d;
            return result;
        }

    }
}
