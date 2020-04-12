package uj.cs.mp.lab4;

import java.util.Scanner;
import java.util.Stack;

public class Reverse
{
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack<Character>();

        System.out.print("Podaj liczbe znakow: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCharacters = scanner.nextInt();
        System.out.println();

        System.out.println("Podaj znaki na stos: ");
        for(int i = 0; i < numberOfCharacters; i++)
        {
            stack.push(scanner.next().charAt(0));
        }
        System.out.println();

        System.out.println("Znaki zdjete ze stosu: ");
        for(int i = 0; i < numberOfCharacters; i++)
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
