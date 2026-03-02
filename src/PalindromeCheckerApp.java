public class UseCase9PalindromeCheckerApp {

    static class Recursion {

        public static boolean Palindrome(String s, int start, int end) {


            if (start >= end)
                return true;


            if (s.charAt(start) != s.charAt(end))
                return false;


            return Palindrome(s, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        String s = "bob";

        if (Recursion.Palindrome(s, 0, s.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}