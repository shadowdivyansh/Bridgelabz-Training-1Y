package com.gla.arrays;

import java.util.Scanner;

public class Traversing {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(i=0;i<5 ; i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
