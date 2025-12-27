import java.util.Scanner;

public class LowerCaseDemo{
     // convert to string to uppercase
     public static String convertLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);

        }
        return result.toString();

    }

    public static boolean compareString(String lowerCaseByCharAt, String lowerByBuiltIn) {

        if (lowerCaseByCharAt.length() != lowerByBuiltIn.length()) { // if length is not equal return false
            return false;
        }

        for (int i = 0; i < lowerCaseByCharAt.length(); i++) {
            if (lowerCaseByCharAt.charAt(i) != lowerByBuiltIn.charAt(i)) { // Any character not match return a false
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        String lowerCaseByCharAt = convertLowerCase(text); // call function

        // convert using user-defined method
        String lowerByBuiltIn = text.toLowerCase();

        boolean compareResult = compareString(lowerCaseByCharAt, lowerByBuiltIn);

        // displaying results
        System.out.println("\nLowercase using charAt()   : " + lowerCaseByCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerByBuiltIn);

        System.out.println("Are both results equal?    : " + compareResult);

        input.close();

    }
    
}