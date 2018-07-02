using System;
using System.Collections.Generic;
using System.Text;

namespace Day6
{
    class Cikli
    {
        public void Piemers()
        {
            // for, while, do...while

            // i++ ==  i= i+1
            // i-- ==  i= i-1

            // for(sakuma vertiba; lidz kuram ies; i+1)
            for (int i = 0; i<6; i++)
            {
                Console.WriteLine("Kristaps");
                if (i == 3)
                {
                    Console.WriteLine("ir 3!!");
                }
            }

            for(int skaititajs = 7; skaititajs >0; skaititajs--)
            {
                Console.WriteLine("Skaitam uz otru pusi");
            }

            Console.WriteLine("Ievadiet skaitli; ");
            string input = Console.ReadLine();
            int robeza = Convert.ToInt32(input);


            for (int i =0; i<robeza; i++)
            {
                Console.WriteLine(i);
            }
        }

        public void Faktorialis()
        {
            Console.WriteLine("Ievadiet skaitli; ");
            string input = Console.ReadLine();
            int robeza = Convert.ToInt32(input);

            int summa = 0;
            for (int i = 0; i <= robeza; i++)
            {
                summa = summa + i;
            }
            Console.WriteLine("Faktorialis ir " + summa);
        }

        public void Reste()
        {
            Console.WriteLine("Ievadiet skaitli; ");
            string input = Console.ReadLine();
            int robeza = Convert.ToInt32(input);

            //string blabla = "asdfj" + "asddj";

            string restes = "";

                for (int i = 0; i < robeza; i++)
                {
                      restes = restes + "#";

                }
            Console.WriteLine(restes);
            
        }
    }
}
