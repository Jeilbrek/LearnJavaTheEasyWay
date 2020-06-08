package com.adrimrtnz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        System.out.println("Welcome to MadLips, where you can create your own narrative!!!");

        do {
            String color = "____";
            String pastTenseVerb = "____";
            String adjective = "____";
            String noun = "____";

            System.out.print("\nFor the next text select a 'color', a 'past tense verb' an ");
            System.out.println("'adjective' and a 'noun'.");

            System.out.println("The " + color + " dragon " + pastTenseVerb + " at the " + adjective +
                    " knight, who rode in on a sturdy, giant " + noun + ".\n");

            System.out.print("Give me a color: ");
            color = scan.next();
            System.out.print("Give me a past tense verb: ");
            pastTenseVerb = scan.next();
            System.out.print("Give me an adjective: ");
            adjective = scan.next();
            System.out.print("Give me a noun: ");
            noun = scan.next();

            System.out.print("\nYour story is: ");
            System.out.println("The " + color + " dragon " + pastTenseVerb + " at the " + adjective +
                    " knight, who rode in on a sturdy, giant " + noun + ".\n");

            System.out.print("Would you want to play again (y/n)? ");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing, I hope to see you soon!!!");
        scan.close();
    }
}
