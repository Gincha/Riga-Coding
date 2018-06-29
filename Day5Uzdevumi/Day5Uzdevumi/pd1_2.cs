using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Uzdevumi
{
    class pd1_2
    {
        public void uzdevums5()
        {
            Uzdevums5();

        }

        public void uzdevums6()
        {
            Uzdevums6();
        }

        public void uzdevums7()
        {
            Console.WriteLine("Ludzu izvelieties skaitli");
            string skaitlis = Console.ReadLine();
            double cipars = Convert.ToDouble(skaitlis);

            Console.WriteLine(Uzdevums7(cipars));
        }

        public void uzdevums8()
        {
            Console.WriteLine("Ludzu izvelieties skaitli");
            string skaitlis = Console.ReadLine();
            double cipars1 = Convert.ToDouble(skaitlis);

            Console.WriteLine("Ludzu izvelieties skaitli");
            string skaitlis2 = Console.ReadLine();
            double cipars2 = Convert.ToDouble(skaitlis2);

            Console.WriteLine(Uzdevums8(cipars1, cipars2));

        }

        public void uzdevums9()
        {
            Uzdevums9();

        }




        private void Uzdevums5()
        {
            Console.WriteLine("Ludzu ievadiet pirmo skaitli");
            string pirmais = Console.ReadLine();
            double cipars1 = Convert.ToDouble(pirmais);

            Console.WriteLine("Ludzu ievadiet otro skaitli");
            string otrais = Console.ReadLine();
            double cipars2 = Convert.ToDouble(otrais);

            Console.WriteLine("Ludzu izvelieties ko darit ar shiem skaitliem:");
            Console.WriteLine("1 - Saskaitit");
            Console.WriteLine("2 - Atnemt");
            Console.WriteLine("3 - Reizinat");
            Console.WriteLine("4 - Dalit");

            string ievade = Console.ReadLine();

            if (ievade == "1")
            {
                double summa = cipars1 + cipars2;
                Console.WriteLine("Ciparu " + cipars1 + " un " + cipars2 + " summa ir " + summa);
            }
            else
            {
                if (ievade == "2")
                {
                    double starpiba = cipars1 - cipars2;
                    Console.WriteLine("Ciparu " + cipars1 + " un " + cipars2 + " starpiba ir " + starpiba);
                }
                else
                {
                    if (ievade == "3")
                    {
                        double reizinajums = cipars1 * cipars2;
                        Console.WriteLine("Ciparu " + cipars1 + " un " + cipars2 + " reizinajums ir " + reizinajums);
                    }
                    else
                    {
                        if (ievade == "4")
                        {
                            double dalijums = cipars1 / cipars2;
                            Console.WriteLine("Ciparu " + cipars1 + " un " + cipars2 + " dalijums ir " + dalijums);
                        }
                        else
                        {
                            Console.WriteLine("Nepareiza ievade");
                        }
                    }
                }
            }
        }

        private void Uzdevums6()
        {
            Console.WriteLine("Ludzu ievadiet kadu no GPA skaitliem");
            string pirmais = Console.ReadLine();

            switch (pirmais)
            {
                case "0":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime F (Failure)");
                    break;
                case "1":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime D (Marginal)");
                    break;
                case "2":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime C (Adequate)");
                    break;
                case "2.5":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime C+ (Satisfactory)");
                    break;
                case "3":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime B (Good)");
                    break;
                case "3.5":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime B+ (Very good)");
                    break;
                case "4":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime A (Excellent)");
                    break;
                case "4.5":
                    Console.WriteLine("Skaitlim " + pirmais + " atbilst atzime A+ (Exceptional)");
                    break;
                default: Console.WriteLine("Kludaina ievade");
                    break;
            }
        }

        private double Uzdevums7(double a)
        {
            double rezultats = 0;
            Console.WriteLine("Ludzu izvelieties vai kapinat 2. vai 3. pakape");
            string ievade = Console.ReadLine();
            if (ievade == "2")
            {
                rezultats = a * a;
            }
            else
            {
                if (ievade == "3")
                {
                   rezultats = a * a * a;
                }
                else
                {
                    Console.WriteLine("Nepareiza ievade");
                }
            }
                return rezultats;
            
        }

        private double Uzdevums8(double a, double b)
        {
            double rezultats =0;

            if (a > b)
            {
                rezultats = a;
            }
            else
            {
                if (a < b)
                {
                    rezultats = b;
                }else
                {
                    rezultats = a;
                }
            }
            return rezultats;
        }
        private void Uzdevums9()
        {
            Console.WriteLine("Nospiediet atbilstoso skaitli, lai izsauktu funkciju:");
            Console.WriteLine("5 - Lai izsauktu piekto funkciju");
            Console.WriteLine("6 - lai izsauktu sesto funkciju");
            Console.WriteLine("7 - lai izsauktu septito funkciju");
            Console.WriteLine("8 - lai izsauktu astoto funkciju");

            string ievade = Console.ReadLine();

            if (ievade == "5")
            {
                uzdevums5();
            }
            else
            {
                if (ievade == "6")
                {
                    uzdevums6();
                }
                else
                {
                    if (ievade == "7")
                    {
                        uzdevums7();
                    }
                    else
                    {
                        if (ievade == "8")
                        {
                            uzdevums8();
                        }
                        else
                        {
                            Console.WriteLine("Nepareiza ievade");
                        }
                    }
                }
            }
        }
    }
}
