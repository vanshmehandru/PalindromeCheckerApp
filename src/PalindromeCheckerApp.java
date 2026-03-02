import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase13PalindromeCheckerApp {

    // 1️⃣ Reverse String Approach
    public static boolean reverseMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // 2️⃣ Stack Approach
    public static boolean stackMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : cleaned.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : cleaned.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque Approach
    public static boolean dequeMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : cleaned.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC13 - Performance Comparison) ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\n--- Results ---");
        System.out.println("Reverse Method Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result:   " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result :   " + result3 +
                " | Time: " + (end3 - start3) + " ns");
        scanner.close();
    }
}