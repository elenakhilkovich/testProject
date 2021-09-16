package com.testproject.lesson7;

import java.util.Arrays;

public class DZ7 {
    public static void main(String[] args) {
        year(1900);
        applicationVersion(1, 2010);
        delivery(95);
        withoutTakes("abcdef");

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseFullName(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void year(int y) {
        System.out.println("упражнение 1");
        int vy = y % 4;
        int vy1 = y % 100;
        int vy2 = y % 400;
        if (vy == 0) {
            if (vy1 == 0 && vy2 != 0) {
                System.out.println(y + " год не високосный");
            } else {
                System.out.println(y + " год високосный");
            }
        } else {
            System.out.println(y + " год не високосный");
        }
    }


    private static void applicationVersion(int clientOs1, int clientDeviceYear) {
        System.out.println("упражнение 2");
        int currentYear = 2021;
        if (clientDeviceYear < currentYear) {
            if (clientOs1 == 0) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            }
        } else {
            if (clientOs1 == 0) {
                System.out.println("Установите версию IOS по ссылке");
            } else {
                System.out.println("Установите версию Android по ссылке");
            }
        }

    }


    private static void delivery(int deliveryDistance) {        // Правильно ли исправила прошлое дз?
        System.out.println("упражнение 3");
        int time = 1;
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет  " + time + " день");
        } else {
            if (deliveryDistance < 60) {
                System.out.println("Доставка займет " + (time + 1) + " дня");
            } else {
                System.out.println("Доставка займет " + (time + 2) + " дня");
            }
        }
    }
    private static void withoutTakes(String input) { //abc aabbcc
        System.out.println("упражнение 4");


        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                System.out.println("Найден дубль = " + input.charAt(i));
                return;
            }
        }
        System.out.println("Не найден дубль");
    }

    private static void reverseFullName(int[] r) { // ['q', 'm', 'n', 'b', 'c', 't', 'e', 'q', 'u', 'y', 'c', 'p', 'g']
        System.out.println("упражнение 5");         // ['g', 'm']
//        for (int i = r.length - 1; i >= 0; i--) {
//            System.out.print(r[i]);
//        }
//        System.out.println();

        int lastIndex = r.length - 1;
        for (int i = 0; i < r.length / 2; i++) {
            // i = 1
            int temp = r[i];            //temp = m
            r[i] = r[lastIndex - i];        // ['c', 'm', 'n', 'b', 'c']
            r[lastIndex - i] = temp;        // ['c', 'm', 'n', 'b', 'g']

        }

        // ['c', 'c', 'n', 'm', 'g']

//        for (int i = 0; i < size / 2; i++) {             //условие: меняем местами проходя только до половины длины массива
//            temp = reverseFullName[size - i - 1];  //size - i - 1 это противоположное число
//            reverseFullName[size - i - 1] = reverseFullName[i];
//            reverseFullName[i] = temp;
//        }
//        for (int i = 0; i < reverseFullName.length; i++) {
//            System.out.print(reverseFullName[i]);
//        }
    }
}

