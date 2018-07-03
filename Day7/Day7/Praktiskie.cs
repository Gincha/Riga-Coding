using System;
using System.Collections.Generic;
using System.Text;

namespace Day7
{
    class Praktiskie
    {
        public void Pirmais()
        {
            //Izvadit summu skaitlu reizinajumam * 2 (skaitli no 1-9)
            //t.i. (1*2) + (2*2) + (3*2) +...

            int reizin = 0;
            int atmina = 0;
            string iekava = "";
            string kede = "";

            for (int i=1; i<=9; i++)
            {
                reizin = i * 2;
                atmina = atmina + reizin;
                iekava = Convert.ToString(reizin);
                kede = kede +iekava + " + ";
            }
            Console.WriteLine(kede + " = " + atmina);
        }

        public void Otrais()
        {
            //Likt cilvekam meginat uzminet skaitli. Ja skaitlis sakrit ar 11, tad pareizi
            //Max meginajumu skaits - 5.
            //Ja 5 reizes nesanak, tad izvadit pazinojumu.



            for (int i=1; i<=6; i++)
            {
                Console.WriteLine("Uzminiet skaitli");
                string input = Console.ReadLine();
                int atbilde = Convert.ToInt32(input);

                if (atbilde == 11)
                {
                    Console.WriteLine("Pareizi");
                    break;
                }
                else
                {

                    Console.WriteLine("Tas meginajums " + i +"/5 ir neveiksmigs :(");
                    
                }if (i == 5)
                {
                    
                    Console.WriteLine("Neizdevas, vairak iespeju nebus");
                    break;
                }
                
            }

        }
    }
}
