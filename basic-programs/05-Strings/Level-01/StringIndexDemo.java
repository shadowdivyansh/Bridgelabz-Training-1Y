package com.gla.String.Level1;

import java.util.Scanner;

class StringIndexDemo {

    static void generate(String text) {
        System.out.println(text.charAt(100));
    }

    static void handle(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handle(text);
    }
}

