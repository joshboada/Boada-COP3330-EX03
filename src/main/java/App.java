/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Who said it?");
        String said = input.nextLine();

        System.out.println(said + " says, \"" + quote + "\"");
    }
}