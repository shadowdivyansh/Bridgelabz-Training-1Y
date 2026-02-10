package com.gla.String.Level2;

import java.util.Scanner;

class CharType {

    static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if (ch >= 'a' && ch <= 'z') {

            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not Letter";
    }

    static String[][] analyze(String text) {

        String[][] arr = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            arr[i][0] = String.valueOf(text.charAt(i));
            arr[i][1] = check(text.charAt(i));
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] res = analyze(text);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}

