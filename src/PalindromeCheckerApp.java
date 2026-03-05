import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 7.0");
        System.out.println("System initialized successfully.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.nextLine();

        // Create Deque (Double Ended Queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);   // Add to rear
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);

        scanner.close();
    }
}