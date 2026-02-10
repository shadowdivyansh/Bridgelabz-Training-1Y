package com.gla.String.level3;

import java.util.Scanner;

class UniqueChars {

    static int length(String s) {

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

    static char[] unique(String text) {

        int n = length(text);

        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {

            char ch = text.charAt(i);

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = ch;
            }
        }

        char[] res = new char[k];

        for (int i = 0; i < k; i++) {
            res[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] res = unique(text);

        for (char c : res) {
            System.out.print(c + " ");
        }
    }
}

