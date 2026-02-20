/**
 * ============================================================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ============================================================================
 * * Use Case 1: Application Entry & Welcome Message
 * * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 * * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 * * No palindrome logic is implemented yet.
 * * The goal is to establish a clear startup flow.
 **/
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner for dynamic input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare the first and last elements
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}