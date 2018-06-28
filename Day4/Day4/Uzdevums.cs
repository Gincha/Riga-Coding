using System;
using System.Collections.Generic;
using System.Text;

namespace Day4
{
    class Uzdevums
    {

        public void Beigas()
        {
            Izvade();
            Console.WriteLine("Ievadiet pirmo skaitli");
            String ciparsviens = Console.ReadLine();
            int a = Convert.ToInt32(ciparsviens);

            Console.WriteLine("Ievadiet otro skaitli");
            String ciparsDivi = Console.ReadLine();
            int b = Convert.ToInt32(ciparsDivi);

            int rezultats = Saskaitisana(a,b);

            Console.WriteLine(rezultats);

            Console.ReadLine();
        }

        private void Izvade()
        {
            Console.WriteLine("Sis ir");
            Console.WriteLine("viegls uzdevums.");
        }

        private int Saskaitisana(int a, int b)
        {
            int result = a+b;
            return result;

        }

        

    }
}
