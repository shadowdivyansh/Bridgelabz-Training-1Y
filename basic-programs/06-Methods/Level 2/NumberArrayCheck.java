package com.gla.methods;

import java.util.Scanner;

class NumberArrayCheck {
    public static boolean pos(int n) { return n >= 0; }
    public static boolean even(int n) { return n % 2 == 0; }
    public static int cmp(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (pos(a[i])) {
                if (even(a[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else System.out.println("Negative");
        }
        int r = cmp(a[0], a[4]);
        System.out.println(r);
    }
}

