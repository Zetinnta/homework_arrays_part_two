package ru.skypro;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1, 2, 3
        int[] accounting = generateRandomArray();
        int summary = 0;
        int minPayment = accounting[0];
        int maxPayment = accounting[0];
        double average = 0;

        // accounting = generateRandomArray();
        /* for (int i = 0; i < accounting.length; i++) {
            if (i == accounting.length - 1) {
                System.out.print(accounting[i]);
                break;
            }
            System.out.print(accounting[i] + " ");
        */

        String a = Arrays.toString(accounting);
        System.out.println(a);
        for (final int payment : accounting) {
            if (payment < minPayment) {
                minPayment = payment;
            }
            if (payment > maxPayment) {
                maxPayment = payment;
            }
            summary += payment;
            average = (double) summary / accounting.length;
        }
        System.out.println("Сумма трат за месяц составила " + summary + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей.");
        System.out.println("Средняя сумма затрат за месяц составила " + average + " рублей. Если округлить: " + Math.round(average) + " рублей.");

        System.out.println();
        // Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}