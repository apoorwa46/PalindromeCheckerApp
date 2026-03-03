import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "refer";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {

            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The given string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}