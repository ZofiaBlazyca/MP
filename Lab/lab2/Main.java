package uj.cs.mp.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        System.out.println();

        // tworzenie tablicy
        //List<Integer> randomArray = new ArrayList<>();
        int[] array = new int[sizeOfArray];
        Random random = new Random();

        // wypelnianie tablicy jednowymiarowej losowymi liczbami z zakresu 0-11
        System.out.println("Wylosowana tablica jednowymiarowa to: ");
        for(int i = 0; i < sizeOfArray; i++)
        {
            array[i] = random.nextInt(12);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // wypelnianie tablicy dwuwymiarowej losowymi liczbami z zakresu 0-18
        System.out.println("Wylosowana tablica dwuwymiarowa to: ");
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
