using System;

namespace Day8
{
    class Program
    {
        static void Main(string[] args)
        {
            // switch un case Izvelne

            CikluUzdevumi klase = new CikluUzdevumi();
            string ievade = "";

            Masivi arr = new Masivi();

            do
            {
                Console.WriteLine("Izvelieties kuru funkciju izpildit 1, 2, 3, 4. Lai aizvertu nospiediet 0");
                ievade = Console.ReadLine();

                switch (ievade)
                {
                    case "1":
                        klase.Uzdevums();
                        break;
                    case "2":
                        arr.IzvaditMasivu();
                        break;
                    case "3":
                        arr.Uzdevums();
                        break;
                    case "4":
                        arr.Uzdevums2();
                        break;
                    default:
                        Console.WriteLine("nepareiza ievade");
                        break;
                }
            } while (ievade != "0");
        }
    }
}
