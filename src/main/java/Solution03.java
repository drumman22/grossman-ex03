/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
ask for quote, set var using scanner
ask for author, set var using scanner
print author and corresponding quote
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String quote, author;

        // Get input
        System.out.println("What is the quote? ");
        quote = input.nextLine();
        System.out.println("Who said it? ");
        author = input.nextLine();

        // Output
        System.out.println(author + " says, \"" + quote + "\" ");
    }
}
