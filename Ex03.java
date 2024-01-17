package org.example;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        /*
        3. Написать функцию, возвращающую истину, если в переданном массиве есть два
        соседних элемента, с нулевым значением.
        */
        Random random = new Random();
        int[] arrTrue = {5, 8, 3, 4, 0, 0, 8, 9, 1};
        int[] arrFalse = {1, 2, 0, 4, 5, 0, 7, 8, 9};

        System.out.println("Правда: " + isZeroArray(arrTrue));
        System.out.println("Ложь: " + isZeroArray(arrFalse));
    }

    public static boolean isZeroArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0)
                return true;
        }
        return false;
    }
}
