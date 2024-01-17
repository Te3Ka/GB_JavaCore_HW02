package org.example;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        Требуется написать метод, принимающий на вход размеры двумерного массива и выводящий массив в виде инкременированной цепочки чисел, идущих по спирали.
        Примеры:
        2х3

        1 2
        6 3
        5 4

        3х1
        1 2 3
        4х4

        Explain

        01 02 03 04
        12 13 14 05
        11 16 15 06
        10 09 08 07
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте количество столбцов = ");
        int column = scanner.nextInt();
        System.out.print("Задайте количество строк = ");
        int row = scanner.nextInt();
        int[][] arr = new int[row][column];
        drawSpiral(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%1$02d", arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void drawSpiral(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int max = row * column - 1;
        int count = 0;
        int rowMin = 0, rowMax = row - 1;
        int columnMin = 0, columnMax = column - 1;

        while (count <= max) {
            // По верхней строке вправо
            for (int i = columnMin; count <= max && i <= columnMax; i++) {
                arr[rowMin][i] = count;
                count++;
            }
            rowMin++;

            // По правому столбцу вниз
            for (int i = rowMin; count <= max && i <= rowMax; i++) {
                arr[i][columnMax] = count;
                count++;
            }
            columnMax--;

            // По нижней строке влево
            for (int i = columnMax; count <= max && i >= columnMin; i--) {
                arr[rowMax][i] = count;
                count++;
            }
            rowMax--;

            // По левому столбцу вверх
            for (int i = rowMax; count <= max && i >= rowMin; i--) {
                arr[i][columnMin] = count;
                count++;
            }
            columnMin++;
        }
    }
}
