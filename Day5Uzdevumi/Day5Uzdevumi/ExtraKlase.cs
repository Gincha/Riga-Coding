using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Uzdevumi
{
    class ExtraKlase
    {

        public void Uzdevums12()
        {
            Console.WriteLine("Ludzu ievadiet menesim atbilstosu skaitli");
            string pirmais = Console.ReadLine();

            switch (pirmais)
            {
                case "1":
                    Console.WriteLine("Janvari ir 31 diena");
                    break;
                case "2":
                    Console.WriteLine("Februari ir 28 dienas");
                    break;
                case "3":
                    Console.WriteLine("Marta ir 31 diena");
                    break;
                case "4":
                    Console.WriteLine("Aprili ir 30 dienas");
                    break;
                case "5":
                    Console.WriteLine("Maija ir 31 diena");
                    break;
                case "6":
                    Console.WriteLine("Junija ir 30 dienas");
                    break;
                case "7":
                    Console.WriteLine("Julija ir 31 diena");
                    break;
                case "8":
                    Console.WriteLine("Augusta ir 31 diena");
                    break;
                case "9":
                    Console.WriteLine("Septembri ir 30 dienas");
                    break;
                case "10":
                    Console.WriteLine("Oktobri ir 31 diena");
                    break;
                case "11":
                    Console.WriteLine("Novembri ir 30 dienas");
                    break;
                case "12":
                    Console.WriteLine("Decembri ir 31 diena");
                    break;
                default:
                    Console.WriteLine("Kludaina ievade");
                    break;
            }
        }

        public void Uzdevums15()
        {
            Console.WriteLine("Ludzu ievadiet trijstura malas garumu 1/3");
            string skaitlis = Console.ReadLine();
            double cipars1 = Convert.ToDouble(skaitlis);

            Console.WriteLine("Ludzu ievadiet trijstura malas garumu 2/3");
            string skaitlis2 = Console.ReadLine();
            double cipars2 = Convert.ToDouble(skaitlis2);

            Console.WriteLine("Ludzu ievadiet trijstura malas garumu 3/3");
            string skaitlis3 = Console.ReadLine();
            double cipars3 = Convert.ToDouble(skaitlis3);

            if (cipars1 > 0&& cipars2 > 0 && cipars3 > 0)
            {
                
                      Console.WriteLine("Trijsturis ir derigs");
                    }
                    else
                    {
                Console.WriteLine("Trijsturis nav reals");
                    }
                
            

        }

        public void Uzdevums151()
        {
            Console.WriteLine("Ludzu ievadiet trijstura 1. stura lenki");
            string skaitlis = Console.ReadLine();
        double cipars1 = Convert.ToDouble(skaitlis);

        Console.WriteLine("Ludzu ievadiet trijstura 2. stura lenki");
            string skaitlis2 = Console.ReadLine();
        double cipars2 = Convert.ToDouble(skaitlis2);

        Console.WriteLine("Ludzu ievadiet trijstura 3. stura lenki");
            string skaitlis3 = Console.ReadLine();
        double cipars3 = Convert.ToDouble(skaitlis3);

            double lenkiSumma = cipars1 + cipars2 + cipars3;

            if (lenkiSumma == 180)
            {
                
                      Console.WriteLine("Trijsturis ir derigs");
                    }
                    else
                    {
                Console.WriteLine("Trijsturis nav reals");
                    }
                
            
        }
}
}
