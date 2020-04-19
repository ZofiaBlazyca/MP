package uj.cs.MP.Lab.lab2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        System.out.println();

        // creating an array
        int[] array = new int[sizeOfArray];
        Random random = new Random();

        // filling the 1D array with random numbers from range 0-11
        System.out.println("Drawn one-dimensional array: ");
        for(int i = 0; i < sizeOfArray; i++)
        {
            array[i] = random.nextInt(12);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // filling the 2D array with random numbers from range 0-18
        System.out.println("Drawn two-dimensional array: ");
        int[][] array2 = new int[sizeOfArray][sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++)
        {
            for(int j = 0; j < sizeOfArray; j++)
            {
                array2[i][j] = random.nextInt(19);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
