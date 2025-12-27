import java.util.Scanner;

public class CharacterFrequencyNested {


    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        //  Find frequency using nested loops
        for (int i = 0; i < chars.length; i++) {

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            frequency[i] = 1; // initialize frequency

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count valid characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = input.nextLine();

        String[] result = findCharacterFrequency(text);

        System.out.println("Character : Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        input.close();
    }
}
