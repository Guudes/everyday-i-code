package com.guu.tasks;

public class BubbleSort {

    public int[] bubbleSort(int[] numbers) {

        while (true) {
            boolean move = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    move = true;
                }
            }
            if (!move) {
                break;
            }
        }
        return numbers;
    }
}