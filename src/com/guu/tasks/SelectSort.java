package com.guu.tasks;

public class SelectSort {

    private int count;

    public int[] selectSort(int[] numbers) {

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
        return numbers;
    }

    public int getPassesNum() {
        return count;
    }
}

