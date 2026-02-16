package com.gla.methods;

import java.util.Scanner;

class NumberCheck {
    public int check(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberCheck obj = new NumberCheck();
        System.out.println(obj.check(n));
    }
}
