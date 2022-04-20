package ru.skypro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println(checkingYear(2014));

        //task2

        specifyOperatingSystemAndYearManufacturePhone();

        //task 3
        System.out.println(calculatesDeliveryTime(10));

        //task4
        checkThereAreNoDuplicates("aabccddefgghiijjkk");

        //task5
        int[] array = {5, 8, 2, 3, 9};
        rearrangeArrayValues(array);

    }

    //task1
    public static String checkingYear(int year) {
        if (year % 4 == 0) {
            return (year + " год является високосным.");
        } else if (year % 100 == 0 && year % 400 == 0) {
            return (year + " год является високосным.");
        } else {
            return (year + " год не является високосным.");

        }

    }


    //task2
    public static void specifyOperatingSystemAndYearManufacturePhone() {
        System.out.println();
        System.out.println("Ввведите тип операционной системы Вашего телефона: 0 - для iOS, 1 - для Android.");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            System.out.println("Укажите год выпуска телефона");
            Scanner console2 = new Scanner(System.in);
            int clientDeviceYear = console.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно.");
            } else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (number == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            System.out.println("Укажите год выпуска телефона");
            Scanner console2 = new Scanner(System.in);
            int clientDeviceYear = console.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно.");
            } else
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    //task3
    public static String calculatesDeliveryTime(double deliveryDistance) {

        int days = (int) (Math.round(deliveryDistance / 40) + 1);
        if (deliveryDistance <= 20) {
            return "Потребуются сутки";
        } else {
            return "Потребуется дней: " + days;

        }
    }

    //task4
    public static void checkThereAreNoDuplicates(String text) {
        System.out.println();
        String template = "";
        String withoutD = "";
        String current;
        for (int i = 0; i < text.length(); i++) {
            current = text.substring(i, i + 1);
            if (i == 0) {
                template = current;
                withoutD = current;
            } else {
                if (template.indexOf(current) == -1) {
                    withoutD += current;
                    template += current;
                    System.out.println("В строке " + template + " нет дублей. ");
                } else {
                    if (template.indexOf(current) != -1) {
                        System.out.println("Haйден дубирующийся символ - " + current);
                        break;
                    }
                }
            }
        }
    }

    //task5
    public static void rearrangeArrayValues(int[] array) {
        System.out.println();
        System.out.println(Arrays.toString(array));
        for (int m = 0; m < array.length / 2; m++) {
            int st = array[m];
            array[m] = array[array.length - m - 1];
            array[array.length - m - 1] = st;
        }
        System.out.println(Arrays.toString(array));
    }
}










