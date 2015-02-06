package com.guu;

import com.guu.tasks.*;


public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, -2, 5, 3, 9, -1, 7, 4, 0, -5, 1, -4, 8, 2, -3, 6};
        String[] capitName = {"Washington", "London", "Paris", "St.Petersburg", "Oslo", "Yokohama"};


        System.out.println("Сортировка Bubble методом:");

        BubbleSort bubbleSort = new BubbleSort();
        int[] resultBubble = bubbleSort.bubbleSort(getArrayCopyNmb(numbers));

        for (int i = 0; i < resultBubble.length; i++) {
            System.out.print(resultBubble[i] + " ");
        }

        System.out.println();
        System.out.print("Циклов: " + bubbleSort.getPassesNum() + "\n\n");


        System.out.println("Сортировка чисел поиском мин. значения:");

        SelectSort selectSort = new SelectSort();
        int[] resultSelecton = selectSort.selectSort(getArrayCopyNmb(numbers));

        for (int i = 0; i < resultSelecton.length; i++) {
            System.out.print(resultSelecton[i] + " ");
        }

        System.out.println();
        System.out.print("Циклов: " + selectSort.getPassesNum() + "\n\n");


        System.out.println("Сортировка строк по длине:");

        StringLengthSort stringLengthSort = new StringLengthSort();
        String[] resultStringLength = stringLengthSort.stringLengthSort(capitName);

        for (int i = 0; i < resultStringLength.length; i++) {
            System.out.print(resultStringLength[i] + " ");
        }

        System.out.println();
        System.out.print("Циклов: " + stringLengthSort.getPassesNum() + "\n\n");

    }

    private static int[] getArrayCopyNmb(int[] numbers) {
        int[] nmbCopy = new int[numbers.length];
        for (int i = 0; i < nmbCopy.length; i++) {
            nmbCopy[i] = numbers[i];
        }
        return nmbCopy;
    }

}