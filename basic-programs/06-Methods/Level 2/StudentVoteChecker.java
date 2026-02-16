package com.gla.methods;

import java.util.Scanner;

class StudentVoteChecker {
    public boolean canStudentVote(int a) {
        if (a < 0) return false;
        return a >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.println(obj.canStudentVote(a[i]));
        }
    }
}

