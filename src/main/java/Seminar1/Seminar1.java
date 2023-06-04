package Seminar1;

public class Seminar1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        int minLength = 9;
        int result = checkArrayLength(array, minLength);
        System.out.println(result);
    }

    public static int checkArrayLength(int [] array, int minLength){
        if (array.length < minLength) {
            return -1;
        } else {
            return array.length;
        }
    }
}
