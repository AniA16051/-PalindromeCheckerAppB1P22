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
import java.util.Stack;
class PalindromeCheckerApp {
    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner for dynamic input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check: ");
        String input = scanner.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters
        for (char c : input.toCharArray()) {
            // Stack.pop() returns characters in reverse order of entry
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}