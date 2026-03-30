import java.util.Scanner;

public class PalindromeCheck {
    public static boolean checkPalindromeLoop(String inputText) {

        int left = 0;
        int right = inputText.length() - 1;

        // keep moving until both pointers meet
        while (left < right) {
            if (inputText.charAt(left) != inputText.charAt(right)) {
                return false; // if any mismatch no need to continue
            }

            left++; // move forward
            right--; // move backward
        }

        return true;
    }

    // recursion based solution

    public static boolean checkPalindromeRecursive(String txt, int startIndex, int endIndex) {

        // base case
        if (startIndex >= endIndex) {
            return true;
        }

        // compare current characters
        if (txt.charAt(startIndex) != txt.charAt(endIndex)) {
            return false;
        }

        // recursive call
        return checkPalindromeRecursive(txt, startIndex + 1, endIndex - 1);
    }

    public static char[] reverseText(String text) {

        char[] reversedChars = new char[text.length()];
        int pos = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedChars[pos] = text.charAt(i);
            pos++; // increment separately
        }

        return reversedChars;
    }

    // array comparison approach
    public static boolean checkPalindromeWithArray(String text) {

        char[] originalChars = text.toCharArray();
        char[] reversedChars = reverseText(text);

        // comparing character
        for (int i = 0; i < originalChars.length; i++) {
            if (originalChars[i] != reversedChars[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String userInput = scanner.next(); // using next() intentionally (spaces ignored)

        System.out.println("\n--- Palindrome Check Results ---");

        System.out.println("Method 1 (Loop): " +
                (checkPalindromeLoop(userInput) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Method 2 (Recursion): " +
                (checkPalindromeRecursive(userInput, 0, userInput.length() - 1)
                        ? "Palindrome"
                        : "Not Palindrome"));

        System.out.println("Method 3 (Char Array): " +
                (checkPalindromeWithArray(userInput) ? "Palindrome" : "Not Palindrome"));

        // closing scanner
        scanner.close();
    }
}