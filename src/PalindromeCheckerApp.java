import java.util.*;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {
        boolean IsPalindrome = true;
        String s = "bob";

        LinkedList<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list.addFirst(ch);
        }
        char[] arr = s.toCharArray();
        int end=s.length()-1;
        while(list.size()>1){

            if(arr[end]!=list.removeLast()){
                IsPalindrome = false;
            }

            end--;



        }


        if(IsPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}