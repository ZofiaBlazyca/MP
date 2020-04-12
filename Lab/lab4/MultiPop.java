package uj.cs.mp.lab4;

import java.util.Scanner;
import java.util.Stack;

public class MultiPop
{
    public static Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args)
    {

        System.out.print("Podaj liczbe znakow: ");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int numberOfCharacters = scanner.nextInt();
        System.out.println();

        System.out.println("Podaj znaki na stos: ");
        for(int i = 0; i < numberOfCharacters; i++)
        {
            stack.push(scanner.next().charAt(0));
        }
        System.out.println();

        System.out.print("Podaj ile razy wykonac operacje usun ze stosu: ");
        int k = scanner2.nextInt();
        System.out.println();
        stackMultiPop(k);

        System.out.println("Stos po usunieciu " + k + " znakow:");
        if(stack.empty())
        {
            System.out.println("Pusty");
        }
        while(!stack.empty())
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void stackMultiPop(int k)
    {
        for(int i = 0; i < k; i++)
        {
            if(!stack.empty())
            {
                stack.pop();
            }
        }
    }
}
