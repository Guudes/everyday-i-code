package com.guu;

import com.guu.tasks.*;


public class Main {
    public static void main(String[] args) {

        if (args[0].equalsIgnoreCase("bubbleSort")) {

            int[] bubbleArray = new int[args.length - 1];
            for (int i = 0; i < bubbleArray.length; i++) {
                try {
                    bubbleArray[i] = Integer.parseInt(args[i + 1]);
                } catch (NumberFormatException e) {
                    System.err.println("Error: Wrong data type. Enter the number.");
                    return;
                }
            }

            System.out.println("Sorting with bubble method");
            BubbleSort bubbleSort = new BubbleSort();
            int[] resultBubble = bubbleSort.bubbleSort(bubbleArray);
            for (int i = 0; i < resultBubble.length; i++) {
                System.out.print(resultBubble[i] + " ");
            }

        } else if (args[0].equalsIgnoreCase("selectSort")) {
            System.out.println("Sorting with selection method");
            int[] selectArray = new int[args.length - 1];
            for (int i = 0; i < selectArray.length; i++) {
                selectArray[i] = Integer.parseInt(args[i + 1]);
            }
            SelectSort selectSort = new SelectSort();
            int[] resultSelect = selectSort.selectSort(selectArray);
            for (int i = 0; i < resultSelect.length; i++) {
                System.out.print(resultSelect[i] + " ");
            }

        } else if (args[0].equalsIgnoreCase("stringLengthSort")) {
            System.out.println("Sorting with string length method");
            String[] stringLengthArray = new String[args.length - 1];
            for (int i = 0; i < stringLengthArray.length; i++) {
                stringLengthArray[i] = args[i + 1];
            }
            StringLengthSort stringLengthSort = new StringLengthSort();
            String[] resultStringLength = stringLengthSort.stringLengthSort(stringLengthArray);
            for (int i = 0; i < resultStringLength.length; i++) {
                System.out.print(resultStringLength[i] + " ");
            }

        } else {
            System.err.println("Error: Unknown sorting method");
        }

    }
}
