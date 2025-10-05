using System;

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        string input = Console.ReadLine();
        string[] stringNumbers = input.Split();

        int answer = 0;

        foreach (string i in stringNumbers)
        {
            answer += int.Parse(i);
        }
        Console.Write(answer);
    }
}