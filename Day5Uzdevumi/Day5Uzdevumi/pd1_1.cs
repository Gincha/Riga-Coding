using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Uzdevumi
{
    class pd1_1
    {
        public void Uzdevums1()
        {
            PrasamVardu();

        }
        public void Uzdevums2()
        {
            Savienojam();
        }

        public void Uzdevums3()
        {
            Console.WriteLine("Ludzu ievadiet stringu int forma");
            string strings = Console.ReadLine();

            int cipars = Izvadam(strings);
            Console.WriteLine(cipars);


        }

        private void PrasamVardu()
        {
            Console.WriteLine("Ludzu ierakstiet savu vardu un uzvardu");
            string vardsUzvards = Console.ReadLine();

            Console.WriteLine("Jus sauc " + vardsUzvards);

        }

        private void Savienojam()
        {
            Console.WriteLine("ludzu ievadiet pirmo stringu");
            string pirmais = Console.ReadLine();

            Console.WriteLine("ludzu ievadiet otro stringu");
            string otrais = Console.ReadLine();

            Console.WriteLine("Savienojot abus stringus sanaks: " + pirmais + otrais);

        }

        private int Izvadam(string viens)
        {

            int skaitlis = Convert.ToInt32(viens);

            return skaitlis;
        }

        public void IzvelamiesFunkciju()
        {
            Console.WriteLine("Nospiediet atbilstoso skaitli, lai izsauktu funkciju:");
            Console.WriteLine("1 - Lai izsauktu pirmo funkciju");
            Console.WriteLine("2 - lai izsauktu otro funkciju");
            Console.WriteLine("3 - lai izsauktu treso funkciju");

            string ievade = Console.ReadLine();

            if(ievade == "1")
            {
                Uzdevums1();
            }
            else
            {
                if (ievade == "2")
                {
                    Uzdevums2();
                }
                else
                {
                    if (ievade == "3")
                    {
                        Uzdevums3();
                    }else
                    {
                        Console.WriteLine("Nepareiza ievade");
                    }
                }
            }

        }
    }
}
