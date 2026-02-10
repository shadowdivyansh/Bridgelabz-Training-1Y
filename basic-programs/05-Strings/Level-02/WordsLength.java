package com.gla.String.Level2;

import javajava.util.Scanner;

class WordsLength {

    static int findLength(String s) {
        int i = 0;

        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static String[] splitText(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        int k = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                words[k++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }

        words[k] = temp;

        return words;
    }

    static String[][] make2D(String[] words) {
        String[][] arr = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] arr = make2D(words);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

