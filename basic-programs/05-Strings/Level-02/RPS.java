package com.gla.String.Level2;

import java.util.Scanner;

class RPS {

    static String computer() {

        int r = (int) (Math.random() * 3);

        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String u, String c) {

        if (u.equals(c)) return "Draw";

        if (u.equals("rock") && c.equals("scissors")) return "User";
        if (u.equals("paper") && c.equals("rock")) return "User";
        if (u.equals("scissors") && c.equals("paper")) return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int user = 0;
        int comp = 0;

        for (int i = 0; i < n; i++) {

            String u = sc.next();
            String c = computer();

            String w = winner(u, c);

            if (w.equals("User")) user++;
            if (w.equals("Computer")) comp++;

            System.out.println(u + " " + c + " " + w);
        }

        System.out.println("User Win %: " + (user * 100.0 / n));
        System.out.println("Computer Win %: " + (comp * 100.0 / n));
    }
}

