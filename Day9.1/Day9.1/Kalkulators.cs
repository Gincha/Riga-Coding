using System;
using System.Collections.Generic;
using System.Text;

namespace Day9._1
{
    class Kalkulators
    {
        
        public void Izvade()
        {
            string input = "";
            string input2 = "";
            while (input != "0")
            {
                Console.WriteLine("Izvelieties kadu darbibu veikt");
                Console.WriteLine("1 - Saskaitisana");
                Console.WriteLine("2 - Atnemsana");
                Console.WriteLine("3 - Reizinasana");
                Console.WriteLine("4 - Dalisana");
                Console.WriteLine("5 - Kapinasana");
                Console.WriteLine("0 - Iziet");

                input = Console.ReadLine();
 
                switch (input)
                {
                    case "1":
                        Console.WriteLine("Ieraksti pirmo ciparu");
                        input = Console.ReadLine();
                        double a = Convert.ToDouble(input);

                        Console.WriteLine("Ieraksti otro ciparu");
                        input2 = Console.ReadLine();
                        double b = Convert.ToDouble(input2);

                        Saskaitisana(a, b);
                        Console.WriteLine(result);
                        break;
                    case "2":
                        Console.WriteLine("Ieraksti pirmo ciparu");
                        input = Console.ReadLine();
                        double a2 = Convert.ToDouble(input);

                        Console.WriteLine("Ieraksti otro ciparu");
                        input2 = Console.ReadLine();
                        double b2 = Convert.ToDouble(input2);

                        Atnemsana(a2, b2);
                        Console.WriteLine(result);
                        break;
                    case "3":
                        Console.WriteLine("Ieraksti pirmo ciparu");
                        input = Console.ReadLine();
                        double a3 = Convert.ToDouble(input);

                        Console.WriteLine("Ieraksti otro ciparu");
                        input2 = Console.ReadLine();
                        double b3 = Convert.ToDouble(input2);

                        Reizinasana(a3, b3);
                        Console.WriteLine(result);
                        break;
                    case "4":
                        Console.WriteLine("Ieraksti pirmo ciparu");
                        input = Console.ReadLine();
                        double a4 = Convert.ToDouble(input);

                        Console.WriteLine("Ieraksti otro ciparu");
                        input2 = Console.ReadLine();
                        double b4 = Convert.ToDouble(input2);

                        Dalisana(a4, b4);
                        Console.WriteLine(result);
                        break;
                    case "5":
                        Console.WriteLine("Ieraksti pirmo ciparu");
                        input = Console.ReadLine();
                        double a5 = Convert.ToDouble(input);

                        Console.WriteLine("Ieraksti otro ciparu");
                        input2 = Console.ReadLine();
                        double b5 = Convert.ToDouble(input2);

                        Kapinasana(a5, b5);
                        Console.WriteLine(result);
                        break;
                    default: Console.WriteLine("Nepareiza ievade");
                        break;
                }
                
            }
        }

        double result;
        private double Saskaitisana(double a, double b)
        {
            result = a + b;
            return result;
        }

        private double Atnemsana(double a, double b)
        {
            result = a - b;
            return result;
        }

        private double Reizinasana(double a, double b)
        {
            result = a * b;
            return result;
        }

        private double Dalisana(double a, double b)
        {
            result = a / b;
            return result;
        }

        private double Kapinasana (double ievade1, double ievade2)
        {

            int pakape = 0;
            for (double a = ievade1; pakape<=ievade2; pakape++)
            {
                result = a * a;
            }

            return result;
        }
    }
}
