package uj.cs.mp.lab4;

import java.util.Scanner;
import java.util.Stack;

public class Brackets
{
    public static void main(String[] args)
    {
        System.out.print("Podaj liczbe znakow: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCharacters = scanner.nextInt();
        System.out.println();

        char[] arr = new char[numberOfCharacters];
        Stack<Character> stack = new Stack<Character>();

        System.out.println("Podaj znaki do tablicy: ");
        //String input = scanner.next();
        for(int i = 0; i < numberOfCharacters; i++)
        {
            //arr[i] = input.charAt(i); // wczytywanie bez spacji
            arr[i] = scanner.next().charAt(0); // wczytywanie ze spacjami
        }
        System.out.println();

        int parenthesisOpened = 0, parenthesisClosed = 0, squareBracketsOpened = 0, squareBracketsClosed = 0, curlyBracketsOpened = 0, curlyBracketsClosed = 0;
        for(int i = 0; i < numberOfCharacters; i++)
        {
            switch (arr[i])
            {
                case('('):
                {
                    parenthesisOpened++;
                    stack.push('(');
                    break;
                }
                case(')'):
                {
                    parenthesisClosed++;
                    if(stack.peek() == '(')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(')');
                    }
                    break;
                }
                case('['):
                {
                    squareBracketsOpened++;
                    stack.push('[');
                    break;
                }
                case(']'):
                {
                    squareBracketsClosed++;
                    if(stack.peek() == '[')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(']');
                    }
                    break;
                }
                case('{'):
                {
                    curlyBracketsOpened++;
                    stack.push('{');
                    break;
                }
                case('}'):
                {
                    curlyBracketsClosed++;
                    if(stack.peek() == '{')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push('}');
                    }
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        if(parenthesisOpened == parenthesisClosed && parenthesisOpened != 0)
        {
            System.out.println("Wszystkie nawiasy okragle zostaly zamkniete");
        }
        else if(parenthesisOpened != 0)
        {
            System.out.println("Nie wszystkie nawiasy okragle zostaly zamkniete");
        }

        if(squareBracketsOpened == squareBracketsClosed && squareBracketsOpened != 0)
        {
            System.out.println("Wszystkie nawiasy kwadratowe zostaly zamkniete");
        }
        else if(squareBracketsOpened != 0)
        {
            System.out.println("Nie wszystkie nawiasy kwadratowe zostaly zamkniete");
        }

        if(curlyBracketsOpened == curlyBracketsClosed && curlyBracketsOpened != 0)
        {
            System.out.println("Wszystkie nawiasy klamrowe zostaly zamkniete");
        }
        else if(curlyBracketsOpened != 0)
        {
            System.out.println("Nie wszystkie nawiasy klamrowe zostaly zamkniete");
        }

        if(stack.empty())
        {
            System.out.println("Wszystkie nawiasy zostaly zamkniete w dobrej kolejnosci");
        }
        else
        {
            System.out.println("Nawiasy zostaly zamkniete w zlej kolejnosci");
        }
    }
}
