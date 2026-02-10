package com.gla.String.level3;

import java.util.Scanner;

class NestedFrequency {

    static String[][] frequency(String text) {

        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '0') continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;
                    arr[j] = '0';
                }
            }

            freq[i] = count;
        }

        int size = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) size++;
        }

        String[][] res = new String[size][2];

        int k = 0;

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 0) {

                res[k][0] = String.valueOf(arr[i]);
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

