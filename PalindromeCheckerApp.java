import java.util.Scanner;

class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();


        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }

        return check(s, start + 1, end - 1);
    }
}