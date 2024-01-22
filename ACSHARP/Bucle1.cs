using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROYECTOCSHARP
{
    internal class Bucle1
    {
        static void Main(string[] args)
        {
            for (char i = 'A'; i <= 'Z'; i++)
            {
                Console.WriteLine(i + "\t" + (int)i);
            }

            Console.WriteLine("10 LETRAS ALEATORIAS");
            Random rnd = new Random();
            for (int i=0; i < 10; i++)
            {
                Console.Write((char)rnd.Next(65,91) + "  ");
                Console.Write((char)new Random().Next(65,91) + "  ");
            }

            Console.WriteLine("GENERAR 100 LETRAS ALEATORIOAS Y CONTAR CUANTAS VOCALES");
            string patron = "[aeiouAEIOU]"; // 65-90   97-122
            for()








            Console.Read();
        }
    }
}
