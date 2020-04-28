package uj.cs.MP.Lab.lab6;

import java.util.Random;
import java.util.Scanner;

public class recursiveSumMatrix
{
    public static int sumMatrix(int matrix[][], int rows, int columns)
    {
        if(rows == 0)
        {
            rows = matrix.length;
            columns -= 1;
        }
        if(rows == 1 && columns == 1)
        {
            return matrix[0][0];
        }
        return matrix[rows-1][columns-1] + sumMatrix(matrix, rows-1, columns);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rows, columns;
        System.out.print("Podaj liczbe wierszy macierzy: ");
        rows = scanner.nextInt();
        System.out.print("Podaj liczbe kolumn macierzy: ");
        columns = scanner.nextInt();
        int matrix[][] = new int[rows][columns];
        System.out.println("Wylosowana macierz:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = random.nextInt(19);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma elementow macierzy wynosi: " + sumMatrix(matrix, rows, columns));
    }
}
