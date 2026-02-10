package com.gla.String.Level2;

import java.util.Scanner;

class GradeSystem {

    static int[][] generate(int n) {

        int[][] m = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int) (Math.random() * 51) + 50;
            }
        }

        return m;
    }

    static double[][] calculate(int[][] m) {

        double[][] r = new double[m.length][3];

        for (int i = 0; i < m.length; i++) {

            int sum = m[i][0] + m[i][1] + m[i][2];
            double avg = sum / 3.0;
            double per = (sum / 300.0) * 100;

            per = Math.round(per * 100.0) / 100.0;

            r[i][0] = sum;
            r[i][1] = avg;
            r[i][2] = per;
        }

        return r;
    }

    static String grade(double p) {

        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        if (p >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = generate(n);
        double[][] res = calculate(marks);

        for (int i = 0; i < n; i++) {

            String g = grade(res[i][2]);

            System.out.println(
                    marks[i][0] + " " +
                            marks[i][1] + " " +
                            marks[i][2] + " " +
                            res[i][0] + " " +
                            res[i][1] + " " +
                            res[i][2] + " " +
                            g
            );
        }
    }
}

