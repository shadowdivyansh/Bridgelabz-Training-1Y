package com.gla.String.level3;

import java.util.Scanner;

class DeckCards {

    static String[] create() {

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];

        int k = 0;

        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }

        return deck;
    }

    static void shuffle(String[] deck) {

        for (int i = 0; i < deck.length; i++) {

            int r = i + (int)(Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static String[][] distribute(String[] deck, int p) {

        int n = deck.length / p;

        String[][] res = new String[p][n];

        int k = 0;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = deck[k++];
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();

        String[] deck = create();

        shuffle(deck);

        String[][] res = distribute(deck, p);

        for (int i = 0; i < res.length; i++) {

            System.out.println("Player " + (i + 1));

            for (int j = 0; j < res[i].length; j++) {
                System.out.println(res[i][j]);
            }

            System.out.println();
        }
    }
}

