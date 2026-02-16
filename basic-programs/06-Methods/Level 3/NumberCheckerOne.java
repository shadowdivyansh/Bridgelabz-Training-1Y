package com.gla.methods;

class NumberCheckerOne {

    public static int count(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] digits(int n) {
        int c = count(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static boolean duck(int[] d) {
        for (int i = 0; i < d.length; i++)
            if (d[i] == 0) return true;
        return false;
    }

    public static boolean arm(int n, int[] d) {
        int s = 0;
        for (int i = 0; i < d.length; i++)
            s += Math.pow(d[i], d.length);
        return s == n;
    }

    public static int[] largest(int[] d) {
        int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > l1) { l2 = l1; l1 = d[i]; }
            else if (d[i] > l2) l2 = d[i];
        }
        return new int[]{l1, l2};
    }

    public static int[] smallest(int[] d) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int i = 0; i < d.length; i++) {
            if (d[i] < s1) { s2 = s1; s1 = d[i]; }
            else if (d[i] < s2) s2 = d[i];
        }
        return new int[]{s1, s2};
    }
}

