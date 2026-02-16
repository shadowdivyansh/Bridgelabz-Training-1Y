package com.gla.methods;

import java.util.Scanner;

class QuadraticProgram {
    public static double[] roots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0)
            return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
        if (d == 0)
            return new double[]{-b / (2 * a)};
        return new double[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] r = roots(a, b, c);
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}

