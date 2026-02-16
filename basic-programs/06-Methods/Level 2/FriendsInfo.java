package com.gla.methods;

import java.util.Scanner;

class FriendsInfo {
    public static int youngest(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < m) m = a[i];
        return m;
    }

    public static int tallest(int[] h) {
        int m = h[0];
        for (int i = 1; i < h.length; i++)
            if (h[i] > m) m = h[i];
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] h = new int[3];
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) h[i] = sc.nextInt();
        System.out.println(youngest(a));
        System.out.println(tallest(h));
    }
}

