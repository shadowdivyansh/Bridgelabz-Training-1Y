package com.gla.String.Level1;

import java.util.Scanner;

class ArrayIndexDemo {

    static void generate(String[] arr) {
        System.out.println(arr[10]);
    }

    static void handle(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        handle(names);
    }
}

