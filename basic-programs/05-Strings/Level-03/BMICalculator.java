package com.gla.String.level3;

import java.util.Scanner;

class BMICalculator {

    static String status(double bmi) {

        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 40) return "Overweight";
        return "Obese";
    }

    static String[][] calculate(double[][] data) {

        String[][] res = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double w = data[i][0];
            double h = data[i][1] / 100.0;

            double bmi = w / (h * h);

            res[i][0] = String.valueOf(w);
            res[i][1] = String.valueOf(h * 100);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = status(bmi);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] res = calculate(data);

        for (int i = 0; i < 10; i++) {

            System.out.println(
                    res[i][0] + " " +
                            res[i][1] + " " +
                            res[i][2] + " " +
                            res[i][3]
            );
        }
    }
}

