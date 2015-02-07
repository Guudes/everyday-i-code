package com.guu.tasks;

public class Sorting {

    private static long start;
    private static long elapsedTime;

    public static int[] bubbleSort(int[] numbers) {
        start = System.nanoTime();

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

        elapsedTime = System.nanoTime() - start;
        return numbers;
    }

    public static int[] selectSort(int[] numbers) {
        start = System.nanoTime();

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
        }
        elapsedTime = System.nanoTime() - start;
        return numbers;
    }

    public static String[] stringLengthSort(String[] words) {
        start = System.nanoTime();

        while (true) {
            boolean move = false;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    String tmp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = tmp;
                    move = true;
                }
            }
            if (!move) {
                break;
            }
        }
        elapsedTime = System.nanoTime() - start;
        return words;
    }

    public static long returnNanoTime() {
        return elapsedTime;
    }

}
