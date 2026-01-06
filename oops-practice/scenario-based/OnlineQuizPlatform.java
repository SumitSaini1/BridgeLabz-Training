import java.util.*;
// Custom Exception
class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class OnlineQuizPlatform {
    static ArrayList<Integer> scores=new ArrayList<>();
    public static void checkScore(String[] correctAnswers,String[] studentAnswers) throws InvalidQuizSubmissionException {
        // throw exception
        if (correctAnswers.length != studentAnswers.length) {
            throw new InvalidQuizSubmissionException(
                    "Answer length mismatch! Quiz submission is invalid."
            );
        }

        for (int i = 0; i < correctAnswers.length; i++) {

            if (studentAnswers[i] != null &&
                    correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {

                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

    }

    // method to calculate score
    public static int calculateScore(String[] correctAnswers, String[] studentAnswers) {

        int score = 0;

        // compare answers
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != null && correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {
                score++;
            }
        }
        scores.add(score);
        return score;
    }
    public static String getGrade(int score, int totalQuestions) {

        double percentage = (score * 100.0) / totalQuestions;

        if (percentage >= 80) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "Fail";
    }


    public static void main(String[] args) {
        int totalQuestions=10;

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
        try {
            checkScore(correctAnswers, studentAnswers);

            int score = calculateScore(correctAnswers, studentAnswers);
            String grade = getGrade(score, correctAnswers.length);

            System.out.println("\n----- Quiz Result -----");
            System.out.println("Score: " + score + "/" + correctAnswers.length);
            System.out.println("Grade: " + grade);

            System.out.println("\nAll Scores: " + scores);

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        


        // feedback print
        System.out.println("----- Quiz Feedback -----");

        

       
    }

    
}
