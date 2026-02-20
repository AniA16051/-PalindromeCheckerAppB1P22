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
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check: ");
        String input = scanner.nextLine();
        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // Displays the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}