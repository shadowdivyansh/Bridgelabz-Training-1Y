package com.gla.methods;

class FootballStats {

    public static int[] gen() {
        int[] h = new int[11];
        for (int i = 0; i < h.length; i++)
            h[i] = (int)(Math.random() * 101) + 150;
        return h;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) s += a[i];
        return s;
    }

    public static double mean(int[] a) {
        return (double) sum(a) / a.length;
    }

    public static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < m) m = a[i];
        return m;
    }

    public static int max(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > m) m = a[i];
        return m;
    }

    public static void main(String[] args) {
        int[] h = gen();
        System.out.println(mean(h));
        System.out.println(min(h));
        System.out.println(max(h));
    }
}

