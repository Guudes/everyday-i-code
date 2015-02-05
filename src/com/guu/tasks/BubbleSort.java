package com.guu.tasks;

public class BubbleSort {

    private int count;

    public int[] bubbleSort(int[] numbers) {

        count = 0;

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

        return numbers;
    }

    public int getPassesNum() {
        return count;
    }

}
