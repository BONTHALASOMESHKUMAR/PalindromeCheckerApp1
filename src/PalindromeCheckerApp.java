import java.util.Scanner;
import java.util.Stack;


public class PalindromeCheckerApp {


    public static void main(String[] args) {


        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 7.0");
        System.out.println("System initialized successfully.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        PalindromeStrategy strategy = new StackStrategy();


        boolean isPalindrome = strategy.check(input);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {


    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}