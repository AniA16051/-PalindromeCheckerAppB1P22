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


        System.out.println("Input text: " + userInput);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
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