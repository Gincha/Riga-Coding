using System;
using System.Collections.Generic;
using System.Text;

namespace Day9
{
    class Piemeri
    {
        string[] liste = new string[12];
        bool[] tuksaVieta = new bool[12];
        int i;
        string ievade = "e";

        public void Klase()
        {
            //12 vietas
            //readline jaievada vai sols ir tuksh vai nav tuksh
            //izvada visus vardus ieskaitot nulles un extra->tukshas vietas neparada

            do
            {
                Console.WriteLine("Izvelies kuru funkciju izpildit:");
                Console.WriteLine("1 - Ievade");
                Console.WriteLine("2 - Izvade");
                Console.WriteLine("3 - PaNullem");
                Console.WriteLine("e - iziet");

                ievade = Console.ReadLine();

                switch (ievade)
                {
                    case "1": Ievade();
                        break;
                    case "2": Izvade();
                        break;
                    case "3": PaNullem();
                        break;
                    case "e":
                        break;
                    default:
                        Console.WriteLine("Nepareiza ievade");
                        break;
                }

            } while (ievade != "e");
        }

        public void Ievade()
        {
            for (i = 0; i <= 11; i++)
            {
                Console.WriteLine("Ievadiet vai sols Nr." + (i + 1) + " ir tuksh (0) vai cilveka vardu kursh taja sez");
                liste[i] = Console.ReadLine();

            }
        }

        public void Izvade()
        {
            for (i = 0; i <= 11; i++)
            {
                if (liste[i] != "0")
                {
                    Console.WriteLine("Sola nr." + (i + 1) + " sez " + liste[i]);
                }
            }
        }

        public void PaNullem()
        {
            for (i = 0; i <= 11; i++)
            {
                liste[i] = "0";
            }
        }
    }
}
