import java.util.Scanner;

public class SubstringOccurrence {

    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean isMatch = true;

            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = input.nextLine();

        System.out.print("Enter the substring: ");
        String sub = input.nextLine();

        int result = countOccurrences(text, sub);
        System.out.println("Substring occurs " + result + " times.");
    }
}
