package Seminar1;

/*Реализуйте метод, принимающий в качестве аргумента
целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может
лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с
сообщением об ошибке.*/

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{0,0,0},{0,0,0}};
        int result = sumElements(matrix);
        System.out.println(result);

    }
    public static int sumElements(int[][] matrix) {
        //метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов)
        for (int[] row: matrix){
            if (matrix.length != row.length) {
                throw new RuntimeException("Массив не квадратный");
            }
        }
        //в каждой ячейке может лежать только значение 0 или 1
        for (int[] row: matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Могут быть только значение 0 или 1");
                }
            }
        }

        int sum = 0;
        for (int[] row: matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}