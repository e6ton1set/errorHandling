package Seminar2;

/**
 Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 (типа float), и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения,
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
 возвращает введённое число
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        processingEnteredData(); // Задача 1
        //task2(); // Задача 2
        //task2_2(); // Задача 2.2
        //task3(); // Задача 3

    }


    public static float getInputFloat() {

        System.out.println("\nВведите дробное число через запятую\nНапример, 2,2:\n");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("Вы ввели:\n" + (num));
        return num;
    }

    private static float processingEnteredData() {
        try {
            getInputFloat();
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!");
            processingEnteredData();
        }
        return 0;
    }

    public static void task2() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void task2_2() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера");
        } catch (Throwable ex) {
            System.out.println("Ошибка");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static String task3() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        else
            System.out.println(str);
        return str;
    }
}