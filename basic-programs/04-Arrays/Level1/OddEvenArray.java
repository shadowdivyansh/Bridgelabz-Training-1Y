package com.gla.arrays.Level1;

import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Natural Number");
            System.exit(0);
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int eIndex = 0;
        int oIndex = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[eIndex++] = i;
            }
            else {
                odd[oIndex++] = i;
            }
        }

        System.out.println("Even Numbers:");

        for (int i = 0; i < eIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd Numbers:");

        for (int i = 0; i < oIndex; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}

