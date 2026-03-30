import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getCharsUsingLoop(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i); // put charcter in to array 
        }

        return chars;

    }

    public static boolean compareString(char[] builtInArray, char[] userDefinedArray) {

        if (builtInArray.length != userDefinedArray.length) { // if length is not equal return false
            return false;
        }

        for (int i = 0; i < builtInArray.length; i++) {
            if (builtInArray[i] != userDefinedArray[i]) { // Any character not match return a false
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Text word :");
        String text = input.next();

        // convert by tocharArray()
        char[] builtInArray = text.toCharArray();

        char[] userDefinedArray = getCharsUsingLoop(text); // using user define method by charAt(i)

        boolean compareResult = compareString(builtInArray, userDefinedArray); // compare both arrays

        System.out.print("Characters using user-defined method: ");
        for (char c : userDefinedArray) { // diaplay resulr
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");

        for (char c : builtInArray) { // display result
            System.out.print(c + " ");
        }

        System.out.println("\nAre both character arrays equal? : " + compareResult);

        input.close();

    }

}
