package Seminar1;

/*Реализуйте метод checkArray(Integer[] arr),
принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null,
то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках,
то идеально было бы все их “подсветить”*/

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 3, 2, 4, 0};
        List<Integer> nullIndexes = checkArray(arr);
        if (nullIndexes.size() > 0) {
            System.out.println("Массив содержит null в ячейках" + nullIndexes);
        } else {
            System.out.println("Массив не содержит null");
        }
    }

    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndexes.add(i);
            }
        }
        return nullIndexes;
    }
}
