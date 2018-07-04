using System;
using System.Collections.Generic;
using System.Text;

namespace Day8
{
    class Masivi
    {
        public void IzvaditMasivu()
        {                           //sakuma jauztaisa masiva objekts (lidzigi ka ar klasem)
            int[] piemeraMasivs = new int[5];      //beigas iekavas jaraksta skaitlis (cik vertibas var glabat)

            piemeraMasivs[0] = 4;        //obligati sak skaitit masivus ar [0]
            piemeraMasivs[1] = 99;
            piemeraMasivs[2] = 9;
            piemeraMasivs[3] = 6567;
            piemeraMasivs[4] = 567;     // pedejais elements = 4 jo sakuma pateica ka bus [5] vertibas

            for(int i =0; i<5; i++)     //ertakais veids ka i=pieklut masivam ir caur ciklu
            {
                Console.WriteLine(piemeraMasivs[i]);
            }

            Console.WriteLine(piemeraMasivs[0]);    //ja grib izvadit raksta iekavas kuru elementu izvadit


            string[] stringMasivs = new string[5];  //ja grib saglabat 5 stringus, izveido 5 elementus.

            /*stringMasivs[0] = "*";
            stringMasivs[1] = "**";
            stringMasivs[2] = "***";
            stringMasivs[3] = "****";
            stringMasivs[4] = "*****"; */


            /*
            string abs = stringMasivs[3];           //var izmainit viena masiva vertibu
            */
            string zvaigzne = "";
            string[] zvMasivs = new string[5];

            for (int i = 0; i < 5; i++)
            {
                zvaigzne = zvaigzne + "*";
                zvMasivs[i] = zvaigzne;
            }

            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(zvMasivs[i]);
            }

            for (int i = 4; i >= 0; i--)
            {
                Console.WriteLine(zvMasivs[i]);
            }


        }

        public void Uzdevums()
        {
            string atmina = "";

            string[] zvMasivs = new string[10];
            for (int i=0; i<10; i++)
            {
                Console.WriteLine("Pieskiriet vertibu masivam " + i);
                string input = Console.ReadLine();

                zvMasivs[i] = input;
                atmina = atmina + zvMasivs[i] + ", ";
            }
            Console.WriteLine("Masiva elementi ir " +atmina);

        }

        public void Uzdevums2()
        {
            Console.WriteLine("Izvelieties cik masivus izveidot");
            string input = Console.ReadLine();
            int skaits = Convert.ToInt32(input);

            int[] Masivs = new int[skaits];

            string atmina = "";
            for(int i=0; i<skaits; i++)
            {
                Console.WriteLine("pieskiriet vertibu masivam" +i);
                string ievade = Console.ReadLine();
                int vertiba = Convert.ToInt32(ievade);

                Masivs[i] = vertiba;

                atmina = atmina + Masivs[i] + ", ";
            }
            Console.WriteLine(atmina);

        }
    }
}
