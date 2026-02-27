import java.util.Scanner;

class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        PalindromeService service = new PalindromeService();

        boolean isPalindrome = service.checkPalindrome(userInput);

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare the first and last elements
            if (!deque.removeFirst().equals(deque.removeLast())) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
  
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + userInput);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}