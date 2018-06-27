using System;
using System.Collections.Generic;
using System.Text;

namespace Day_3                     //namespace jabut tadam pasam nosaukumam ka program.cs
{
    class JaunaKlase
    {
        public int globals = 4;                 // vares pieklut no visam funkcijam un klasem
        private int lokalsKlasei = 3;       //private var pieklut tikai shaja klase, 

        public int Saskaitit(int a, int b)      // a un b -> vertibas ko var definet funkciju izsaucot
                                                // public var pieklut arpus klases
        {
            int rezultats = a + b;
            //Teksts();
            globals = 6;
            return rezultats;                   // ja nav void tad obligati kaut kadu vertibu ir jaatgriez
                                   // return ir pedeja lieta ko izdara funkcija, ja ir kaut kas pec tad to neizdaris
        }
    
        public void Teksts()                   // private var pieklut tikai no sis klases. 
        {
            globals = 2;                    // public var pieklut no visam klasem
            Console.WriteLine("Debug teksts");
        }
    }
}
