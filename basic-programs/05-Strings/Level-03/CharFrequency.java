package com.gla.String.level3;

import java.util.Scanner;

class CharFrequency {

    static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] res = new String[count][2];

        int k = 0;

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {

                res[k][0] = String.valueOf((char) i);
                res[k][1] = String.valueOf(freq[i]);
                k++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] res = frequency(text);

        for (int i = 0; i < res.length; i++) {

            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}

