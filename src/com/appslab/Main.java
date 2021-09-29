package com.appslab;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String player1 = "Matko";
        String player2 = "Misko";
        Scanner scan = new Scanner(System.in);

        System.out.println("Player 1: Choose rock, paper, or scissors:");
        player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, paper, or scissors:");
        player2 = scan.next().toLowerCase();

        if (player1.equals(player2)) {
            System.out.println("it's a tie!");
        } else if (player1.equals("rock")) {

            if (player2.equals("scissors")) {
                System.out.println("Player 1 wins");
            } else if (player2.equals("paper")) {
                System.out.println("Player 2 wins");
            }
        } else if (player1.equals("paper")) {

            if (player2.equals("rock")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("scissors")) {
                System.out.println("player 2 wins");
            }
        } else if (player1.equals("scissors")) {

            if (player2.equals("paper")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("rock")) {
                System.out.println("player 2 wins");
            }
        }

    }
}