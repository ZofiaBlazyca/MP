package uj.cs.MP.Lab.lab6;

import java.util.Scanner;

public class recursiveSum
{
    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return(n + sum(n-1));
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = 0;
        System.out.print("Podaj liczbe: ");
        largestNumber = scanner.nextInt();
        System.out.println("Suma liczb od 1 do " + largestNumber + " wynosi " + sum(largestNumber));
    }
}
