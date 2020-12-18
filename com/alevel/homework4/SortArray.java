package com.alevel.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент: ");
            array[i] = scanner.nextDouble();
        }
        System.out.println("Введите 1 если хотите отсортировать по возростанию или 2 если наоборот");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println(Arrays.toString(sortAscending(array)));
        } else {
            System.out.println(Arrays.toString(descendingSort(array)));
        }
    }

    static double[] sortAscending(double... Array) {
        for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] > Array[j + 1]) {
                    double tmp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = tmp;
                }
            }
        }
        return Array;
    }

    static double[] descendingSort(double... Array) {
        for (int i = Array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Array[j] < Array[j + 1]) {
                    double tmp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = tmp;
                }
            }
        }
        return Array;
    }
}
