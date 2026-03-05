import java.util.Scanner;
public class  PalindromeCheckerApp {


    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 4.0 - UC4 (Character Array Based Check)");
        System.out.println("System initialized successfully.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        char[] characters = input.toCharArray();


        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }


        System.out.println("\nInput: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}