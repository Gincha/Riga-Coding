using System;
using System.Collections.Generic;
using System.Text;

namespace Day9._1
{
    class Speles
    {
        private void Izvade()
        {

            Console.WriteLine("Ievadi vardu");
            string ievade = Console.ReadLine();
            char[] vards = ievade.ToCharArray();
            char[] svitras = ievade.ToCharArray();

            for (int i = 0; i < vards.Length; i++)  //sadala minamo vardu pa burtiem
            {
                // Get character from array.
                char burts = vards[i];
            }

            char stripa = '-';
            //pec copy/paste vairs kludu nerada
            for (int i = 0; i < vards.Length; i++)   // tads pats garums ka minamajam vardam 
            {
                svitras[i] = stripa;
                char stripBurts = svitras[i];

            }

            Console.WriteLine("Sakam");

            int skaititajs = 0;                  //minesim 10 reizes
            do
            {
                skaititajs++;
                Console.WriteLine("Ievadi minejumu");
                string ievade2 = Console.ReadLine();
                char minejums = Convert.ToChar(ievade2);        //ievada burtu

                string virkne = "";
                string atmina = "";
                for (int i = 0; i < vards.Length; i++)      //katram minejumam jaiet cauri visam arrayam ar minamo vardu
                {
                    char burts = vards[i];      //bez rindinas neatpazist mainigo if`a

                    if (minejums == burts)          //ja minejums sakrit ar burtu minamaja varda
                    {
                        virkne = virkne + vards[i];     //ja sakrit burti tad parada burtu istaja vieta
                    }
                    else
                    {
                        virkne = virkne + svitras[i];       //ja nesakrit burti tad ieliek svitrinu burta vieta
                    }
                }

                atmina = atmina + virkne;
                Console.WriteLine(atmina);          //parada tikai 1 ciklu

            } while (skaititajs != 10);     //iet cauri kamer nav 10 reizes

            Console.WriteLine("Meginajumu skaits beidzies. Minamais vards bija - " + ievade);
            Console.ReadLine();
        }
    }
}
