package org.example;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        /*
        Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
        */
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
            System.out.print(arr[i] + " ");
        }

        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Def = " + (max - min));
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
