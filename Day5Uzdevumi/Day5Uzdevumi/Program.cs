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

            /*
            pd1_1 uzdevums = new pd1_1();
            uzdevums.IzvelamiesFunkciju();

            Console.ReadLine();
            */

            /*
            pd1_2 uzdevumi2 = new pd1_2();
            uzdevumi2.uzdevums5();

            Console.ReadLine();
            */
            /*
            pd1_2 uzdevumi2 = new pd1_2();
            uzdevumi2.uzdevums6();

            Console.ReadLine();
            */
            /*
            pd1_2 uzdevumi2 = new pd1_2();
            uzdevumi2.uzdevums9();

            Console.ReadLine();
            */

            pd1_1 uzdevumi = new pd1_1();
            pd1_2 uzdevumi2 = new pd1_2();

            Console.WriteLine("Ludzu ievadiet kuru uzdevumu izpildit");
            string pirmais = Console.ReadLine();

            switch (pirmais)
            {
                case "1":
                    uzdevumi.Uzdevums1();
                    break;
                case "2":
                    uzdevumi.Uzdevums2();
                    break;
                case "3":
                    uzdevumi.Uzdevums3();
                    break;
                case "4":
                    uzdevumi.IzvelamiesFunkciju();
                    break;
                case "5":
                    uzdevumi2.uzdevums5();
                    break;
                case "6":
                    uzdevumi2.uzdevums6();
                    break;
                case "7":
                    uzdevumi2.uzdevums7();
                    break;
                case "8":
                    uzdevumi2.uzdevums8();
                    break;
                case "9":
                    uzdevumi2.uzdevums9();
                    break;
                default:
                    Console.WriteLine("Ludzu ievadiet pareizu uzdevuma nummuru");
                    break;
            }

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
