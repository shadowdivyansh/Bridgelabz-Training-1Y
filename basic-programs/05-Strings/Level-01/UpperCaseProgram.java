package com.gla.String.Level1;


import java.util.Scanner;

class UpperCaseProgram {

    static String convert(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);

            result += ch;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String s1 = convert(text);
        String s2 = text.toUpperCase();

        System.out.println(compare(s1, s2));
    }
}

