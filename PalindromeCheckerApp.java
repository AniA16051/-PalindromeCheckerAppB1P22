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
import java.util.Scanner;
class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Predefined string for validation
        String input = "madam";
        String reversed = "";

        // Hint Implementation: Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            // Build the reversed version
            reversed += input.charAt(i);
        }

        // Compare original and reversed strings
        boolean isPalindrome = input.equals(reversed);

        // Display results to the console
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
