package com.gla.methods;

import java.util.Scanner;

class FactorsProgram {
    public static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) c++;
        int[] f = new int[c];
        int j = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[j++] = i;
        return f;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) s += a[i];
        return s;
    }

    public static int prod(int[] a) {
        int p = 1;
        for (int i = 0; i < a.length; i++) p *= a[i];
        return p;
    }

    public static double sumSq(int[] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++)
            s += Math.pow(a[i], 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = factors(n);
        for (int i = 0; i < f.length; i++)
            System.out.print(f[i] + " ");
        System.out.println();
        System.out.println(sum(f));
        System.out.println(prod(f));
        System.out.println(sumSq(f));
    }
}

