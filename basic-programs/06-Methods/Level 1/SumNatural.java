package com.gla.methods;

import java.util.Scanner;

class SumNatural {
    public int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) s += i;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumNatural obj = new SumNatural();
        System.out.println(obj.sum(n));
    }
}
