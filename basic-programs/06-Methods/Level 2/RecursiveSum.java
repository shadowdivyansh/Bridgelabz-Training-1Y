package com.gla.methods;

import java.util.Scanner;

class RecursiveSum {
    public static int rec(int n) {
        if (n == 1) return 1;
        return n + rec(n - 1);
    }

    public static int formula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = rec(n);
        int r2 = formula(n);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == r2);
    }
}
