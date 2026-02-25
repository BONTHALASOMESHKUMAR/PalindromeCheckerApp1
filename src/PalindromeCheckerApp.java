import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 3.0");
        System.out.println("System initialized successfully.");

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String original = a.nextLine();


        String reversed = "";


        for (int i = original.length() - 1; i >= 0; i--) {

            reversed += original.charAt(i);
        }


        boolean isPalindrome = original.equals(reversed);


        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
        a.close();
    }
}