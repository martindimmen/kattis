using System;

class Program
{
    static void Main()
    {
        string input = Console.ReadLine();
        string[] stringNumbers = input.Split(" ");

        int answer = 1;
        foreach (string i in stringNumbers)
        {
            answer *= int.Parse(i);
        }
        Console.WriteLine(answer);
    }
}