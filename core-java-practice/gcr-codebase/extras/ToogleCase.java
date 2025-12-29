import java.util.Scanner;

public class ToogleCase {
    // convert to string to uppercase
    public static String convertLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // convert to lower 
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);

        }
        return result.toString();

    }
    public static String convertUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // convert to upper
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            result.append(ch);

        }
        return result.toString();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // convert to lower case 
        System.out.print("Enter a Text in Uppercase to convert in Lowercase: ");
        String text = input.nextLine();
        String lowerCaseByCharAt = convertLowerCase(text); // call function
        System.out.println("LowCase of String: " + lowerCaseByCharAt);

        // convert to UpperCase
        System.out.print("Enter a Text in LowerCase to convert in Uppercase: ");
        String textLower = input.nextLine();

        String uperCaseByCharAt = convertUpperCase(textLower); // call function
        System.out.println("UpperCase of String are: " + uperCaseByCharAt);



    }

}
