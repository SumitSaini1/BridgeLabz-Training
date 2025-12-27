import java.util.Scanner;

public class ShortestLongestString {
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

    // this method generates 2D array of word and its length
    public static String[][] generateCorrespondingLength(String text) {

        // split text into words
        String[] words = splitUsingCharAt(text);

        String[][] correspondingLength = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            int count = 0;

            try {
                while (true) {
                    word.charAt(count);
                    count++;
                }
            } catch (StringIndexOutOfBoundsException e) {

            }

            // store word
            correspondingLength[i][0] = word;

            // store length as string
            correspondingLength[i][1] = String.valueOf(count);
        }

        return correspondingLength;
    }

    public static void shortestLongestLength(String text) {
        String[][] result = generateCorrespondingLength(text);
        // assume first word is shortest and longest
        String shortestWord = result[0][0];
        String longestWord = result[0][0];

        int shortestLength = Integer.parseInt(result[0][1]);
        int longestLength = Integer.parseInt(result[0][1]);

        for (int i = 1; i < result.length; i++) {

            int currentLength = Integer.parseInt(result[i][1]);

            // check for shortest word
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = result[i][0];
            }

            // check for longest word
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = result[i][0];
            }
        }

        System.out.println("\nShortest Word : " + shortestWord + " (" + shortestLength + ")");
        System.out.println("Longest Word  : " + longestWord + " (" + longestLength + ")");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = input.nextLine();
        shortestLongestLength(text);
      

        input.close();

    }

}