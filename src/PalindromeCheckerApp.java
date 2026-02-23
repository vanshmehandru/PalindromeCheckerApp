/*
 * UC4: Character Array Based Palindrome Check
 * Goal: Check whether a string is a palindrome using a char array and two-pointer approach
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer technique
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}