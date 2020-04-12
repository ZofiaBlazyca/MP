package uj.cs.mp.lab4;

import java.util.Scanner;
import java.util.Stack;

public class Binary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = 0;
        System.out.print("Podaj liczbe do wyswietlenia binarnie: ");
        decimalNumber = scanner.nextInt();
        decToBin(decimalNumber);
    }
    public static void decToBin(int decimalNumber)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while(decimalNumber != 0)
        {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }
        System.out.print("Podana liczba w systemie binarnym: ");
        while(!stack.empty())
        {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
