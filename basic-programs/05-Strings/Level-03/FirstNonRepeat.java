package com.gla.String.level3;

import java.util.Scanner;

class FirstNonRepeat {

    static char find(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {

            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char ch = find(text);

        if (ch != '\0')
            System.out.println(ch);
        else
            System.out.println("Not Found");
    }
}

