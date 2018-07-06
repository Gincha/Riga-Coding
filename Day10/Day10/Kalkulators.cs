using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day10
{
    class Kalkulators
    {

        public static string Saskaitisana(int a, int b)
        {
            string result = Convert.ToString(a + b);
            return result;
        }

        public static string Atnemsana(int a, int b)
        {
            string result = Convert.ToString(a - b);
            return result;
        }

    }
}
