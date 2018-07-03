using System;
using System.Collections.Generic;
using System.Text;

namespace Day7
{
    class Piemeri
    {
        public void Kamer()
        {
            //while     do.. while
            string ievade = "";
            int skaititajs = 0;
            while (ievade != "iziet")           //vertiba jaraksta pashiem. Vertiba var but jebkas
            {                               // notiks kamer nosacijums bus patiess
                                            // nosacijumu parbauda pirms sak darit
                Console.WriteLine("Uzraksti kaut ko!");
                ievade = Console.ReadLine();
                Console.WriteLine("Mes esam iteracija nr. " + skaititajs);
                skaititajs++;                   //skaititajs  = skaititajs+1;
                Console.WriteLine("Vel esma cikla!");
            }
            Console.WriteLine("Jau izgajam ara");
        }

        public void Darit()
        {
            string ievade = "";
            int skaititajs = 0;
            do                  // sakuma dara un nosacijumu parbauda beigas
            {                   // vienmer ieies cikla vismaz 1 reizi ieksha
                Console.WriteLine("Uzraksti kaut ko!");
                ievade = Console.ReadLine();
                Console.WriteLine("Mes esam iteracija nr. " + skaititajs);
                skaititajs++;                   //skaititajs  = skaititajs+1;
                Console.WriteLine("Vel esma cikla!");
            } while (ievade != "");
            Console.WriteLine("Jau izgajam ara");
        }
    }
}
