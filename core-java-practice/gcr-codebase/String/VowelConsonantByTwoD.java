import java.util.Scanner;

public class VowelConsonantByTwoD {
    // This method converts all uppercase letters into lowercase
    public static char convertLowercase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        return ch;
    }
    public static String findVowelConsonant(char ch) {
       
        ch = convertLowercase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }

    }

    // find consonant and stored in 2D array

    public static String[][] findStroedInTwoDArray(String text){
        

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = findVowelConsonant(ch);
        }
        return result;


    }

    // Display the array contains character type Vowel,Consonant, Not a letter;
    public static void displayResult(String result[][]){

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking full text input from userd
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String[][] result=findStroedInTwoDArray(text);

        displayResult(result);






    }

}
