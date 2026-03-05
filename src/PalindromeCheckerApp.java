import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 5.0");
        System.out.println("System initialized successfully.");

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String original = a.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop characters and compare with original string
        for (char c : original.toCharArray()) {

            char poppedChar = stack.pop();

            if (c != poppedChar) {
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