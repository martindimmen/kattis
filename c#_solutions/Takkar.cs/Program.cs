using System;

namespace Takkar
{
  class Takkar
  {
      static void Main()
    {
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());

        if (a>b){
            Console.WriteLine("MAGA!");
        }
        else if(a<b){
            Console.WriteLine("FAKE NEWS!");
        }
        else if(a==b){
            Console.WriteLine("WORLD WAR 3!");
        }
    }
  }
}
