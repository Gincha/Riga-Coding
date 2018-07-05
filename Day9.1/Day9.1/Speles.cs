using System;
using System.Collections.Generic;
using System.Text;

namespace Day9._1
{
    class Speles
    {
        public void Izvade()
        {
            string input = "";
            int i;

            for (i = 1; i < 11; i++)
            {
                Console.WriteLine("Izvelies karatavu vardu");
                input = Console.ReadLine();
                char[] atbilde = input.ToCharArray();

                for (int a = 0; a < atbilde.Length; a++)
                {
                    char burts = atbilde[a];
                    
                }
                Console.WriteLine("Sakam");


                for (i = 1; i < 11; i++)
                {
                    Console.WriteLine("Meginajums Nr." + i + ". Ieraksti burtu");
                    string chars = Console.ReadLine();
                    char[] minejums = input.ToCharArray();

                    for (int a = 0; a < minejums.Length; a++)
                    {
                        char burti = minejums[a];

                       if (atbilde[a] == minejums[a])
                        {
                            Console.WriteLine(minejums[a]);
                        }
                    }


                    if (i == 11)
                    {
                        Console.WriteLine("Meginajumi beigusies");
                        break;
                    }
                }
            }

        }
    }
}
