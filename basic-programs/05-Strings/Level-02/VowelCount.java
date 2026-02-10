package com.gla.String.Level2;

import java.util.Scanner;

class VowelCount {

    static int check(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if (ch >= 'a' && ch <= 'z') {

            if ("aeiou".indexOf(ch) != -1)
                return 1;
            else
                return 2;
        }

        return 0;
    }

    static int[] count(String text) {

        int v = 0;
        int c = 0;

        for (int i = 0; i < text.length(); i++) {

            int r = check(text.charAt(i));

            if (r == 1) v++;
            if (r == 2) c++;
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] res = count(text);

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}

