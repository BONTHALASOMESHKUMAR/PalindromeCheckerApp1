import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Input : ");
        String input = scanner.nextLine();


        LinkedList<Character> list = new LinkedList<>();


        for (char c : input.toCharArray()) {
            list.add(c);
        }


        boolean isPalindrome = true;


        while (list.size() > 1) {
            char front = list.removeFirst();
            char rear = list.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}