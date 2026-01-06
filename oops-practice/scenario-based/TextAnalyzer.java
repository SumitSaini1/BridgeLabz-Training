import java.util.*;

public class TextAnalyzer {

    // analyze paragraph
    public static void analyzeText(String paragraph, String target, String replacement) {

        // handle empty or blank
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }

        // normalize spaces
        String cleanedParagraph = paragraph.trim().replaceAll("\\s+", " ");

        // split in to words
        String[] words = cleanedParagraph.split("\\W+");

        // count word
        int wordCount = words.length;

        // logest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        
        String replacedParagraph =
                cleanedParagraph.replaceAll("(?i)\\b" + target + "\\b", replacement);


        System.out.println("Original Paragraph:");
        System.out.println(cleanedParagraph);
        System.out.println();

        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println();

        System.out.println("After Replacement:");
        System.out.println(replacedParagraph);
    }


    public static void main(String[] args) {

        String paragraph =
                "  Java is a powerful programming language. java is widely used in enterprise applications!  ";

        analyzeText(paragraph, "java", "Python");
    }
}
