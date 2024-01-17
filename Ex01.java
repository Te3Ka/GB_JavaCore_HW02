package org.example;

public class Ex01 {
    public static void main(String[] args) {
        /*
        Написать метод, возвращающий количество чётных элементов массива.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
        */

        int[] arr = {2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));

    }

    public static int countEvens(int[] arr) {
        int count = 0;

        for (int j : arr) {
            if (j % 2 == 0)
                count++;
        }
        return count;
    }
}