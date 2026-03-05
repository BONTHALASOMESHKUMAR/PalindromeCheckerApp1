import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 6.0");
        System.out.println("System initialized successfully.");

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String original = a.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both Queue and Stack
        for (char c : original.toCharArray()) {
            queue.add(c);     // Enqueue
            stack.push(c);    // Push
        }

        boolean isPalindrome = true;

        // Compare characters using Queue and Stack
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input: " + original);
        System.out.println("Is Palindrome?: " + isPalindrome);

        a.close();
    }
}