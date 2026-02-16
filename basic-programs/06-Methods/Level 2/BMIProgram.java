package com.gla.methods;

import java.util.Scanner;

class BMIProgram {
    public static void calc(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            double w = a[i][0];
            double h = a[i][1] / 100.0;
            a[i][2] = w / (h * h);
        }
    }

    public static String stat(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[10][3];
        for (int i = 0; i < 10; i++) {
            a[i][0] = sc.nextDouble();
            a[i][1] = sc.nextDouble();
        }
        calc(a);
        for (int i = 0; i < 10; i++)
            System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2] + " " + stat(a[i][2]));
    }
}

