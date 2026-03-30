class PalindromeChecker {

    // instance variable to store text
    String text;

    // method to check  text is palindrome
    boolean isPalindrome() {

        // convert text to lowercase a
        String cleanText = text.toLowerCase().replace(" ", "");

        // reverse the string
        String reversed = "";
        for (int i = cleanText.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanText.charAt(i);
        }

        // compare original and reversed text
        if (cleanText.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    // method to display result
    void displayResult() {

        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {

        // first object
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";
        p1.displayResult();

        // second object
        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";
        p2.displayResult();
    }
}
