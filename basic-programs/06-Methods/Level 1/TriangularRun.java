package com.gla.methods;

import java.util.Scanner;

class TriangularRun {
    public double rounds(double a, double b, double c) {
        double p = a + b + c;
        return 5000 / p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        TriangularRun obj = new TriangularRun();
        System.out.println(obj.rounds(a, b, c));
    }
}
