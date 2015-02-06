package com.guu.tasks;

public class StringLengthSort {

    private int count;

    public String[] stringLengthSort(String[] words) {

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
            if (move == false) {
                break;
            }
            count++;
        }
        return words;
    }

    public int getPassesNum() {
        return count;
    }
}