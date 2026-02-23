/*
 * UC3: Palindrome Check Using String Reverse
 * Goal: Check whether a string is a palindrome by reversing it.
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine();

        // Reverse the string using a for loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed using equals()
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}