public class EduQuizGrader {

    // method to calculate score
    public static int calculateScore(String[] correct, String[] student) {

        int score = 0;

        // compare answers
        for (int i = 0; i < correct.length; i++) {
            if (student[i] != null && correct[i].equalsIgnoreCase(student[i])) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {

        // correct answers
        String[] correctAnswers = {
                "A", "C", "B", "D", "A",
                "B", "C", "D", "A", "C"
        };

        // student answers
        String[] studentAnswers = {
                "a", "c", "b", "d", "A",
                "b", "D", "d", "a", "c"
        };

        // feedback print
        System.out.println("----- Quiz Feedback -----");

        for (int i = 0; i < correctAnswers.length; i++) {

            if (studentAnswers[i] != null &&
                    correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {

                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        // calculate score
        int score = calculateScore(correctAnswers, studentAnswers);

        // percentage
        double percentage = (score / 10.0) * 100;

        // result
        System.out.println("\nTotal Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
