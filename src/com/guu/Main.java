package com.guu;

import com.guu.tasks.Sorting;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        if (args[0].equalsIgnoreCase("bubbleSort")) {
            int[] bubbleArray;
            try {
                bubbleArray = stringToIntCopy(args);
            } catch (Exception e) {
                System.err.println("Error: wrong data type");
                return;
            }
            System.out.println("Sorting with bubble method");
            int[] resultBubble = Sorting.bubbleSort(bubbleArray);
            intResultOut(resultBubble);
            System.out.print("Время выполнения сортировки: " + Sorting.returnNanoTime() + " наносекунд");

        } else if (args[0].equalsIgnoreCase("selectSort")) {
            int[] selectArray;
            try {
                selectArray = stringToIntCopy(args);
            } catch (Exception e) {
                System.err.println("Error: wrong data type");
                return;
            }
            System.out.println("Sorting with selection method");
            int[] resultSelect = Sorting.selectSort(selectArray);
            intResultOut(resultSelect);
            System.out.print("Время выполнения сортировки: " + Sorting.returnNanoTime() + " наносекунд");

        } else if (args[0].equalsIgnoreCase("stringLengthSort")) {

            System.out.println("Sorting with string length method");
            String[] stringLengthArray = Arrays.copyOfRange(args, 1, args.length);
            String[] resultStringLength = Sorting.stringLengthSort(stringLengthArray);
            stringResultOut(resultStringLength);
            System.out.print("Время выполнения сортировки: " + Sorting.returnNanoTime() + " наносекунд");

        } else {
            System.err.println("Error: Unknown sorting method");
        }
    }

    private static int[] stringToIntCopy(String[] stringArray) {
        int[] intArray = new int[stringArray.length - 1];
        for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i + 1]);
        }
        return intArray;
    }

    private static void intResultOut(int[] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }

    private static void stringResultOut(String[] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}
