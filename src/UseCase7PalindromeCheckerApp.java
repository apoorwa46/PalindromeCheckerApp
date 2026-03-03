import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "tenet";

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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