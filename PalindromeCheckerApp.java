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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class PalindromeCheckerApp {
    /**
     * Application entry point for UC6.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner for dynamic input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();
        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();
        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        // Flag to track palindrome status
        boolean isPalindrome = true;
        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Queue removes from front (first char), Stack removes from top (last char)
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        // Display results as shown in snapshot
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}