package uj.cs.MP.Lab.lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class recursiveBinarySearch
{
    public static int binsearch (int x, int left, int right, int[] array)
    {
        if (left > right)
            return -1;
        int middle = (left + right) / 2;
        if (x == array[middle])
            return middle;
        if (x > array[middle])
            return binsearch (x, middle+1, right, array);
        else
            return binsearch (x, left, middle-1, array);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Podaj rozmiar tablicy: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++)
        {
            array[i] = random.nextInt(19);
        }
        Arrays.sort(array);
        System.out.println("Wylosowana tablica: ");
        for(int i = 0; i < sizeOfArray; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Podaj element do wyszukania: ");
        int element = scanner.nextInt();
        element = binsearch(element, 0, sizeOfArray - 1, array);
        System.out.println("Znaleziono element na pozycji " + element);
    }
}
