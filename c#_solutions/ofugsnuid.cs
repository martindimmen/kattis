using System;

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
        {
            int input = int.Parse(Console.ReadLine());
            numbers[i] = input;
        }
        for (int i = n - 1; i >= 0; i--)
        {
            Console.WriteLine(numbers[i]);
        }
    }
}