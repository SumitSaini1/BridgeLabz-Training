public class BadWordCensor {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        String badWordsRegex = "\\b(damn|stupid)\\b";
        String output = input.replaceAll(badWordsRegex, "****");

        System.out.println(output);
    }
}
