package com.gla.String.Level2;

import java.util.Scanner;

class CustomTrim {

    static int[] findIndex(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    static String substring(String s, int a, int b) {

        String r = "";

        for (int i = a; i < b; i++) {
            r += s.charAt(i);
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] idx = findIndex(text);

        String s1 = substring(text, idx[0], idx[1]);
        String s2 = text.trim();

        System.out.println(s1.equals(s2));
    }
}

