package com.gla.methods;

import java.util.Scanner;

class SmallLarge {
    public int[] find(int a, int b, int c) {
        int s = a, l = a;
        if (b < s) s = b;
        if (c < s) s = c;
        if (b > l) l = b;
        if (c > l) l = c;
        return new int[]{s, l};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        SmallLarge obj = new SmallLarge();
        int[] r = obj.find(a, b, c);
        System.out.println(r[0] + " " + r[1]);
    }
}
