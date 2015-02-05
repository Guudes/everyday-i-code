import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 3, 9, 4, 0, 3, 9, 4, 0, 3, -5};
        int count = 0;
//
//        while (true) {
//            count++;
//            boolean move = false;
//            for (int i = 0; i < numbers.length - 1; i++) {
//
//                if (numbers[i] > numbers[i + 1]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = tmp;
//                    move = true;
//                }
//            }
//            if (move == false) {
//                break;
//            }
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        System.out.print("Количество циклов: " + count);


        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int minPosition = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    minPosition = j;
                    min = numbers[j];
                }
            }
            if (i != minPosition) {
                int tmp = numbers[i];
                numbers[i] = numbers[minPosition];
                numbers[minPosition] = tmp;
            }
            count++;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.print("Количество циклов: " + count);
    }
}
