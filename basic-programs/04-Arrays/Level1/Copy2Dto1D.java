package com.gla.arrays.Level1;

import java.util.Scanner;

class Copy2Dto1D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = input.nextInt();

        System.out.print("Columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

