package com.gla.arrays.Level2;

import java.util.Scanner;

class BMI2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter persons: ");
        int n = input.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Weight: ");
            data[i][0] = input.nextDouble();

            System.out.print("Height: ");
            data[i][1] = input.nextDouble();

            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {

            System.out.println("BMI = " + data[i][2] + " Status = " + status[i]);
        }
    }
}

