package com.gla.methods;

import java.util.Scanner;

class ChocolateDivide {
    public int[] calc(int n, int m) {
        return new int[]{n / m, n % m};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ChocolateDivide obj = new ChocolateDivide();
        int[] r = obj.calc(n, m);
        System.out.println(r[0] + " " + r[1]);
    }
}

