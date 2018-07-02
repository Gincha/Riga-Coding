using System;
using System.Collections.Generic;
using System.Text;

namespace Day6
{
    class Repeat
    {
        public void Izvade()
        {
            //Izvadit vai nu # vai ## atkariba no lietotaja ievades. Cilvekam jaievada vesels
            //skaitlis un jaizsauc funkcija Sharp(SEIT LIEKAM SKAITLISKU VERTIBU);

            /*
            Console.WriteLine("Ludzu ievadiet veselu skaitli");
            string skaitlis = Console.ReadLine();
            int cipars = Convert.ToInt32(skaitlis);
            
            Console.WriteLine(Sharp(cipars));
            */

            Console.WriteLine("Ludzu ievadiet veselu skaitli");
            string skaitlis = Console.ReadLine();
            int cipars = Convert.ToInt32(skaitlis);

            string simbols = Sharp(cipars);

             Console.WriteLine(simbols);
        }
        private string Sharp(int a)
        {

            string result;

            if (a > 5)
            {
                 result = "##";

            }
            else
            {
                result = "#";
            }

            return result;

            /*string result = "";
            //TODO ja int a lielaks par 5, tad atgriezt ##, ja ne, tad #
            return result;
            */
        }
    }
}
