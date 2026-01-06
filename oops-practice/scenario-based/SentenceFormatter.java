public class SentenceFormatter {
    // create method for format sentence
    public static String formatSentence(String paragraph) {

        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        // remove extra spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            // capitalize first letter
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                // ensure one space
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello   world.this is a test!how are you?   i am fine.";
        System.out.println(formatSentence(input));
    }
}
