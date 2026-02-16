package com.gla.methods;

import java.util.Scanner;

class TrigFunctions {
    public double[] calc(double d) {
        double r = Math.toRadians(d);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        TrigFunctions obj = new TrigFunctions();
        double[] r = obj.calc(d);
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}

