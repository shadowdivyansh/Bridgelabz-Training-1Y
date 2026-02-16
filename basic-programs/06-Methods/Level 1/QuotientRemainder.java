package com.gla.methods;

import java.util.Scanner;

class QuotientRemainder {
    public int[] calc(int n, int d) {
        return new int[]{n / d, n % d};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        QuotientRemainder obj = new QuotientRemainder();
        int[] r = obj.calc(n, d);
        System.out.println(r[0] + " " + r[1]);
    }
}
