package com.alevel.homework4;

import java.util.Scanner;

public class MaxAndMinElements {
    public static void main(String[] args) {
        System.out.println("Введите любые 10 чисел:");
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " число:");
            array[i] = scanner.nextDouble();
        }
        System.out.println("Введите max если хотите получить наибольшое число или введите min сли хотите получить наименьшее число");
        String s1 = "";
        while (true) {
            s1 = scanner.nextLine();
            if (s1.equals("max")) {
                System.out.println("Наибольшое число" + getMax(array));
                break;
            } else if (s1.equals("min")) {
                System.out.println("Наименьшее число " + getMin(array));
                break;
            }
        }
    }

    static double getMax(double... array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static double getMin(double... array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


