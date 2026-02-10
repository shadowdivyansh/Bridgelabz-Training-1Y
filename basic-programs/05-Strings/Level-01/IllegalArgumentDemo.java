package com.gla.String.Level1;

import java.util.Scanner;

class IllegalArgumentDemo {

    static void generate(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handle(text);
    }
}

