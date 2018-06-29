using System;

namespace Day5Uzdevumi
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            int vaiBusHotdogs = HotDogs(5);
            if(vaiBusHotdogs == 1)
            {
                Console.WriteLine("voohoo, es sodien tomer edisu");
            }
            else
            {
                Console.WriteLine("noperc labak roltonu :(");
            }
            

            Console.ReadLine();
            */

            pd1_1 uzdevums = new pd1_1();
            uzdevums.IzvelamiesFunkciju();

            Console.ReadLine();

        }


        /*
        static int HotDogs(int naudasmaks)
        { 
        int result = 0;
        int hotdogaCena = 3;

        int starpiba = naudasmaks - hotdogaCena;

            if (starpiba >= 0)
            {
                result = 1;
            }
            else
            {
                result = 0;
            }

            return result;

         }
         */


    }
}
