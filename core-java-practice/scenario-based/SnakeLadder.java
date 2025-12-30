import java.util.*;

public class SnakeLadder {
    // case:1
    public static int generateNumber() {
        // generate random number between 1 to 6
        int dice = (int) (Math.random() * 6) + 1;
        return dice;

    }

    // optins to take
    public static String option() {
        String[] options = { "No Play", "Ladder", "Snake" };
        // generate number between 0 to 2 for find option using index
        int random = (int) Math.floor(Math.random() * 10) % 3;
        String option = options[random];
        return option;

    }

    // Method when players turn
    public static int playerTurn(String option, int dice, int position) {

        if (option.equals("No Play")) {
            // do nothing
        } else if (option.equals("Ladder")) {
            int nextPosition = position + dice;
            if (nextPosition <= 100) {
                position = nextPosition;

            }

        } else {// run when Option is Snake

            position = position - dice;
            // useCase4
            // if position is neagative so reset to 0
            if (position < 0) {
                position = 0;
            }
        }
        return position;

    }

    // SINGLE PLAYER GAME
    public static void singlePlayerGame() {
        final int MAX_POSITION = 100;
        // Variables
        int position = 0;
        int diceRollCount = 0;

        while (position < MAX_POSITION) {

            // call method to generate number
            int dice = generateNumber();
            // call method to select option
            String option = option();

            position = playerTurn(option, dice, position);

            // use case: 6 count every roll
            diceRollCount++;
            System.out.println("Dice: " + dice);
            System.out.println("Option: " + option);
            System.out.println("Position: " + position);
            System.out.println("----------------------");

        }
        System.out.println("-------------------------RESULT----------------------");
        System.out.println("User Reach its maximum Position");
        System.out.println(" Dice Roll :" + diceRollCount);
        System.out.println("=====================================================");

    }

    // DOUBLE PLAYER GAME
    public static void doublePlayerGame() {
        // Fixed Variable
        final int MAX_POSITION = 100;
        // Variables
        int firstPlayerPosition = 0;
        int secondPlayerPosition = 0;
        int diceRollCount = 0;

        while (firstPlayerPosition < MAX_POSITION && secondPlayerPosition < MAX_POSITION) {

            // call method to generate number player first
            String optionOne;
            do {
                int diceRollOne = generateNumber();
                diceRollCount++;

                optionOne = option();
                firstPlayerPosition = playerTurn(optionOne, diceRollOne, firstPlayerPosition);

            } while (optionOne.equals("Ladder"));

            // FOR SECOND PLAYER
            String optionTwo;
            do {
                int diceRollTwo = generateNumber();
                diceRollCount++;

                optionTwo = option();
                secondPlayerPosition = playerTurn(optionTwo, diceRollTwo, secondPlayerPosition);

            } while (optionTwo.equals("Ladder"));

            System.out.println("First Player Position: " + firstPlayerPosition);
            System.out.println("Second Player Position: " + secondPlayerPosition);

        }
        // Display Result
        System.out.println("====================RESULT============================");
        if (firstPlayerPosition == MAX_POSITION && secondPlayerPosition != MAX_POSITION) {
            System.out.println("Who Win: First player Won ");
        } else if (firstPlayerPosition != MAX_POSITION && secondPlayerPosition == MAX_POSITION) {
            System.out.println("Who Win: Second Player Win");

        }

    }

    public static void main(String[] args) {
        // call single player game 
        singlePlayerGame();
        // call double player game
        doublePlayerGame();

    }

}
