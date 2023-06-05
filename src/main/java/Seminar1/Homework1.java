package Seminar1;

// реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.ArrayList;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("\n=============================================");
        ifZero(10, 5);
        System.out.println("\n=============================================");
        int[] array = {1, 5, 10, 20};
        getIndex(array, 2);
        System.out.println("=============================================");
        String[] sArray = {"Один"};
        printStringArray(sArray);
        System.out.println("=============================================");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Первый массив " + Arrays.toString(array1));
        System.out.println("Второй массив " + Arrays.toString(array2));
        System.out.println("Разница двух массивов " + differenceArray(array1, array2));
        System.out.println("Частное двух массивов " + divideArray(array1, array2));
    }

    // деление на ноль
    public static void ifZero(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Ошибка: на ноль делить нельзя.");
        } else {
            int result = a / b;
            System.out.print("Результат деления числа " + a + " на число " + b + " равен " + result);
        }
    }

    // выход за пределы массива
    public static void getIndex(int[] array, int index) {
        if (index > array.length - 1 && index < array.length) {
            throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом не существует.");
        } else {
            System.out.printf("Элемент с индексом %d равен %d\n", index, array[index]);
        }
    }

    // исключение пустого указателя
    public static void printStringArray(String[] sArray) {
        for (String item : sArray) {
            if (item == null) throw new NullPointerException("Элемент с пустым значением.");
            System.out.println(item);
        }
    }
    // разница двух массивов
    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }
    // частное двух массивов
    public static ArrayList<Float> divideArray(int[] a1, int[] a2) {
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("Один из массивов является пустым.");
        }
        if (min < max) {
            throw new RuntimeException("Длины массивов не равны.");
        }
        for (int i = 0; i < min; i++) {
            if (a2[i] != 0) {
                res.add((float) (a1[i] / a2[i]));
            } else {
                throw new RuntimeException("Попытка деления на наль.");
            }
        }
        return res;
    }
}
