package com.gla.String.Level2;
import java.util.Scanner;

class MinMaxWord {

    static String[] splitText(String text) {
        return text.split(" ");
    }

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

    static String[] findMinMax(String[] words) {

        String min = words[0];
        String max = words[0];

        for (int i = 1; i < words.length; i++) {

            if (findLength(words[i]) < findLength(min))
                min = words[i];

            if (findLength(words[i]) > findLength(max))
                max = words[i];
        }

        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[] res = findMinMax(words);

        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
}


