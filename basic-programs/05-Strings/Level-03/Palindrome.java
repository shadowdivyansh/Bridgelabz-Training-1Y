package com.gla.String.level3;

import java.util.Scanner;

class Palindrome {

    static boolean check1(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    static boolean check2(String s, int i, int j) {

        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

        return check2(s, i + 1, j - 1);
    }

    static boolean check3(String s) {

        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        int k = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[k++] = a[i];
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(check1(text));
        System.out.println(check2(text, 0, text.length() - 1));
        System.out.println(check3(text));
    }
}

