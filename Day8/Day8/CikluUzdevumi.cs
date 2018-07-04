using System;
using System.Collections.Generic;
using System.Text;

namespace Day8
{
    class CikluUzdevumi
    {
        public void Uzdevums()
        {
            int i = 0;
            string ievade = "";
            string zvaigzne = "*";
            string atmina = "";
            Console.WriteLine("Ludzu ievadi skaitli");
            ievade = Console.ReadLine();
            int a = Convert.ToInt32(ievade);

            if (a <= 0)
            {
                Console.WriteLine("Nepareiza ievade");
            }
            else
            {
                for (i = 0; i < a; i++)
                {
                    atmina = atmina + zvaigzne;
                    Console.WriteLine(atmina);
                }
            }


        }

    }
}
