import java.util.Scanner;

public class SplitTextDemo {

    // this method finds length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // this method splits text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // count number of words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // store indexes of spaces
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // array to store words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end;

            if (i < spaceIndex.length) {
                end = spaceIndex[i];
            } else {
                end = length;
            }

            String word = "";
            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    // this method compares two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking full text input from user
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // split using user-defined method
        String[] wordsByCharAt = splitUsingCharAt(text);

        // split using built-in method
        String[] wordsBySplit = text.split(" ");

        // compare both results
        boolean result = compareArrays(wordsByCharAt, wordsBySplit);

        // display words
        System.out.println("\nWords using charAt():");
        for (String w : wordsByCharAt) {
            System.out.println(w);
        }

        System.out.println("\nWords using split():");
        for (String w : wordsBySplit) {
            System.out.println(w);
        }

        System.out.println("\nAre both results equal? : " + result);

        input.close();
    }
}
