using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3c
{
        class Program
        {
            public static void Main(string[] args)
            {
                Atomic atm = new Atomic();
                int i = 0;

                do
                {
                    i++;
                    atm.accept();

                } while (i != 3);
                System.Console.WriteLine(" ");
                atm.display();


            }
        }
 }
