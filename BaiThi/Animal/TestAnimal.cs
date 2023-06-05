using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animal
{
    internal class TestAnimal
    {
       static void Main(string[] args)
        {
            Lion L = new Lion();
            Tiger T = new Tiger();

            L.SetMe("Lion", 100);
            L.Show();

            T.SetMe("Tiger", 289);
            T.Show();

        }

    }
}
