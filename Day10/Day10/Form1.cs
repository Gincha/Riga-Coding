using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Day10
{
    public partial class Form1 : Form
    {
        private int skaitlis1 = 0;
        private int skaitlis2 = 0;
        private string darbiba = "";

        public Form1()
        {
            InitializeComponent();
        }

        private void IevadesPoga_Click(object sender, EventArgs e)
        {
            //int a = 5;

            string ievade = IevadesPoga.Text ;
            ChanGeLabel(ievade);

            string[] pogas = new string[10];

            //TekstaIzvade.Text = ievade;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string ievade = button1.Text;
            ChanGeLabel(ievade);

        }

        private void ChanGeLabel(string cipars)
        {
            TekstaIzvade.Text = cipars;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string ievade = button2.Text;
            ChanGeLabel(ievade);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string ievade = button3.Text;
            ChanGeLabel(ievade);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string ievade = button4.Text;
            ChanGeLabel(ievade);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            string ievade = button5.Text;
            ChanGeLabel(ievade);
        }

        private void button6_Click(object sender, EventArgs e)
        {
            string ievade = button6.Text;
            ChanGeLabel(ievade);
        }

        private void button7_Click(object sender, EventArgs e)
        {
            string ievade = button7.Text;
            ChanGeLabel(ievade);
        }

        private void button8_Click(object sender, EventArgs e)
        {
            string ievade = button8.Text;
            ChanGeLabel(ievade);
        }

        private void button9_Click(object sender, EventArgs e)
        {
            string ievade = button9.Text;
            ChanGeLabel(ievade);
        }

        private void button10_Click(object sender, EventArgs e)
        {
            string ievade = button0.Text;
            ChanGeLabel(ievade);
        }

        private void Saskaitisana_Click(object sender, EventArgs e)
        {
            string vertiba = TekstaIzvade.Text;
            skaitlis1 = Convert.ToInt32(vertiba);

            darbiba = Saskaitisana.Text;
        }

        private void Vienads_Click(object sender, EventArgs e)
        {
            string vertiba = TekstaIzvade.Text;
            skaitlis2 = Convert.ToInt32(vertiba);

             
            if( darbiba == "+")
            {
                TekstaIzvade.Text = Kalkulators.Saskaitisana(skaitlis1, skaitlis2);
            }
            else
            {
                TekstaIzvade.Text = Kalkulators.Atnemsana(skaitlis1, skaitlis2);
            }

        }

        private void Atnemsana_Click(object sender, EventArgs e)
        {
            string vertiba = TekstaIzvade.Text;
            skaitlis1 = Convert.ToInt32(vertiba);

            darbiba = Atnemsana.Text;
        }
    }
}
