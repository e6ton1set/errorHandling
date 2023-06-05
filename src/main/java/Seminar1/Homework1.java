package Seminar1;

// реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("\n=============================================");
        ifZero(10, 5);
        System.out.println("\n=============================================");
        int[] array = {1, 5, 10, 20};
        getIndex(array, 2);
        System.out.println("=============================================");
        String [] sArray = {null};
        printStringArray(sArray);
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
}