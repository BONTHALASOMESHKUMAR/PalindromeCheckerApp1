import java.util.Scanner;


public class PalindromeCheckerApp {


    public static void main(String[] args) {


        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 7.0");
        System.out.println("System initialized successfully.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;


        for (int i = 0; i < normalized.length() / 2; i++) {


            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}