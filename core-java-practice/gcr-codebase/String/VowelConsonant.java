import java.util.Scanner;

public class VowelConsonant {

    // This method converts all uppercase letters into lowercase
    public static String convertLowercase(String text) {
        StringBuilder result = new StringBuilder();
        //// Loop through each character of the string one by one
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void countVowelConsonant(String resultLowerCase) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < resultLowerCase.length(); i++) {
            char ch = resultLowerCase.charAt(i);
            // Count only alphabet characters as consonants

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;

                } else {
                    consonantCount++;
                }
            }
        }
        // Display final count of vowels and consonants

        System.out.println("-------------------Output---------------------");
        System.out.println("The total number of vowel in given String is " + vowelCount);
        System.out.println("The total number of consonant in given String is " + consonantCount);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking full text input from user
        System.out.print("Enter a text: ");
        String text = input.nextLine();
        // Convert input text into lowercase
        String resultLowerCase = convertLowercase(text);
        // Count vowels and consonants
        countVowelConsonant(resultLowerCase);

    }

}
