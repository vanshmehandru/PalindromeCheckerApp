/*
 * UC2: Check User Input and Print Yes/No
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
