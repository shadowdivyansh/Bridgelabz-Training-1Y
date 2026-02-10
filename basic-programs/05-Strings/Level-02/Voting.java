package com.gla.String.Level2;

import java.util.Scanner;

class Voting {

    static int[] generate(int n) {

        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            age[i] = (int) (Math.random() * 90) + 10;
        }

        return age;
    }

    static String[][] check(int[] age) {

        String[][] arr = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {

            arr[i][0] = String.valueOf(age[i]);

            if (age[i] >= 18)
                arr[i][1] = "Can Vote";
            else
                arr[i][1] = "Cannot Vote";
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] age = generate(n);
        String[][] res = check(age);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}

