using System;
using System.Collections.Generic;
using System.Text;

namespace Day4
{
    class Zarosanas
    {
        public void LielaksVaiMazaks()
        {
            Console.WriteLine("Ludzu ievadiet skaitli");
            string input = Console.ReadLine();
            int skaitlis = Convert.ToInt32(input);

            // vai skaitlis ir lielaks vai mazaks par 5

            /*
             * Operatori: 
             *              < mazaks
             *              > lielaks
             *              <= mazaks vai vienads
             *              >= lielaks vai vienads
             *              == vienads
             *              !=  nav vienads
             *              && un
             *              || vai
             * */

            if (skaitlis > 5)    //  ()iekavas jaieraksta nosacijums
            {                               // ja nav figuriekavas tad tiek izpildita tikai 1 rindinja.
                Console.WriteLine("Skaitlis " + skaitlis + " ir lielaks par pieci");
            }                           // ja ir iekavas tad izpilda visu kas ir iekavas

            else { 
                if (skaitlis == 5)
                      {
                     Console.WriteLine("Skaitlis " + skaitlis + " ir vienads ar pieci");
                     }
                  else
                       {
                      Console.WriteLine("Skaitlis " + skaitlis + " ir mazaks par pieci");
                        }
                  }
        }

        public void ArIf()   //Main funkcija var uztaisit visu ievades wirteline un read line un
        {                           // () iekavas ieraksta (ievade) tad nav jataisa katra funkcija ievades blakis
            // 0 - 10
            // 10 -> "Ievade ir desmit"
            // cits skaitlis -> kludaina ievade

            Console.WriteLine("Ludzu ievadiet skaitli no 1 lidz 10");
            string cipars = Console.ReadLine();
            int ievade = Convert.ToInt32(cipars);

            if (ievade == 1)           // if`a var salidzinat divas lietas vienlaicigi skaitlis >10 || skaitlis < 10
            {                                               //      || nozime vai, && nozime un
                Console.WriteLine("Ievade ir viens");
            }
            else
            {
                if  (ievade == 2)          // talak var rakstit visus if ja ievade ir vienada ar ciparu un nav darbiba
                    {                                       // kura iztrauce izpildi
                        Console.WriteLine("Ievade ir divi");
                    }
                else
                {
                    if (ievade == 3)
                    {
                        Console.WriteLine("Ievade ir tris");
                    }
                    else
                    {
                        if (ievade == 4)
                        {
                            Console.WriteLine("Ievade ir cetri");
                        }
                        else
                        {
                            if (ievade == 5)
                            {
                                Console.WriteLine("Ievade ir pieci");
                            }
                            else
                            {
                                if (ievade == 6)
                                {
                                    Console.WriteLine("Ievade ir sesi");
                                }
                                else
                                {
                                    if (ievade == 7)
                                    {
                                        Console.WriteLine("Ievade ir septini");
                                    }
                                    else
                                    {
                                        if (ievade == 8)
                                        {
                                            Console.WriteLine("Ievade ir astoni");
                                        }
                                        else
                                        {
                                            if (ievade == 9)
                                            {
                                                Console.WriteLine("Ievade ir devini");
                                            }
                                            else
                                            {
                                                if (ievade == 10)
                                                {
                                                    Console.WriteLine("Ievade ir desmit");
                                                }
                                                else
                                                {
                                                    Console.WriteLine("Kludaina ievade");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public void ArCase()
        {
            Console.WriteLine("Ludzu ievadiet skaitli no 1 lidz 10");
            string cipars = Console.ReadLine();
            
            switch (cipars)                     // switcha ieksha var ielikt TIKAI mainigo. nevar konkretu vertibu
            {                       //switch labak lietot ja japarbauda konkretas vertibas
                case "1":
                    Console.WriteLine("Ievade ir viens");
                    break;
                case "2":
                    Console.WriteLine("Ievade ir divi");
                    break;
                case "3":
                    Console.WriteLine("Ievade ir tris");
                    break;
                case "4":
                    Console.WriteLine("Ievade ir cetri");
                    break;
                case "5":
                    Console.WriteLine("Ievade ir pieci");
                    break;
                case "6":
                    Console.WriteLine("Ievade ir sesi");
                    break;
                case "7":
                    Console.WriteLine("Ievade ir septini");
                    break;
                case "8":
                    Console.WriteLine("Ievade ir astoni");
                    break;
                case "9":
                    Console.WriteLine("Ievade ir devini");
                    break;
                case "10":
                    Console.WriteLine("Ievade ir desmit");
                    break;
                default:
                    Console.WriteLine("Kludaina ievade");
                    break;

            }
        }
    }
}
