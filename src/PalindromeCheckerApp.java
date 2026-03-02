public class UseCase10PalindromeCheckerApp {

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

        String s = "A Man a Plan a Canal Panama";
        String newString = s.toLowerCase();
        System.out.println(newString);
        String removedspace = newString.replace(" ","");
        System.out.println(removedspace);

        if (Recursion.Palindrome(removedspace, 0, removedspace.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}