import java.util.Scanner;

public class UppercaseCompare {
    // convert to string to uppercase
    public static String convertUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);

        }
        return result.toString();

    }

    public static boolean compareString(String uperCaseByCharAt, String upperByBuiltIn) {

        if (uperCaseByCharAt.length() != upperByBuiltIn.length()) { // if length is not equal return false
            return false;
        }

        for (int i = 0; i < uperCaseByCharAt.length(); i++) {
            if (uperCaseByCharAt.charAt(i) != upperByBuiltIn.charAt(i)) { // Any character not match return a false
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        String uperCaseByCharAt = convertUpperCase(text); // call function

        // convert using user-defined method
        String upperByBuiltIn = text.toUpperCase();

        boolean compareResult = compareString(uperCaseByCharAt, upperByBuiltIn);

        // displaying results
        System.out.println("\nUppercase using charAt()   : " + uperCaseByCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperByBuiltIn);
        System.out.println("Are both results equal?    : " + compareResult);

        input.close();

    }

}
