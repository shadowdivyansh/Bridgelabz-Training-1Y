package com.gla.methods;

class RandomStats {
    public static int[] generate4DigitRandomArray(int s) {
        int[] a = new int[s];
        for (int i = 0; i < s; i++)
            a[i] = (int)(Math.random() * 9000) + 1000;
        return a;
    }

    public static double[] findAverageMinMax(int[] a) {
        int min = a[0], max = a[0], sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        return new double[]{(double)sum / a.length, min, max};
    }

    public static void main(String[] args) {
        int[] a = generate4DigitRandomArray(5);
        double[] r = findAverageMinMax(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}

