package com.guu.tasks;


public class Sort3 {
    int[] numbers = {10, 5, 3, 9, 4, 0, 3, 9, 4, 0, 3, -5};
    int count = 0;

    public void sort3() {

        while (true) {
            count++;
            boolean move = false;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    move = true;
                }
            }

            if (move == false) {
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
