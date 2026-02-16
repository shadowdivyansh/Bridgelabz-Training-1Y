package com.gla.methods;

import java.util.Scanner;

class Handshakes {
    public int calc(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Handshakes obj = new Handshakes();
        System.out.println(obj.calc(n));
    }
}
