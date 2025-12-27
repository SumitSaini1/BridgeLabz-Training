import java.util.Scanner;

public class RockPaperScissors {

    // find computer choice by math.random
    public static String getComputerChoice() {
        // find random choice
        int choice = (int) (Math.random() * 3); // 0, 1, or 2

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // find winner
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if (user.equalsIgnoreCase("Rock") && computer.equals("Scissors") ||
            user.equalsIgnoreCase("Paper") && computer.equals("Rock") ||
            user.equalsIgnoreCase("Scissors") && computer.equals("Paper")) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // method to calculate wining percentage 
    public static String[][] calculateStats(int userWin, int computerWin, int totalGames) {

        double userPercent = (userWin * 100.0) / totalGames;
        double computerPercent = (computerWin * 100.0) / totalGames;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = userPercent + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWin);
        stats[1][2] = computerPercent + "%";

        return stats;
    }

   // function to display the result 
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\n---------------- Game Results ----------------");
        System.out.println("Game  User Choice  Computer Choice  Winner");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-5s %-12s %-16s %-10s%n",
                    gameResults[i][0],
                    gameResults[i][1],
                    gameResults[i][2],
                    gameResults[i][3]);
        }

        System.out.println("\n-------------- Final Statistics --------------");
        System.out.println("Player     Wins     Win Percentage");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-10s %-8s %-10s%n",
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        String[][] gameResults = new String[games][4];

        int userWin = 0;
        int computerWin = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWin++;
            else if (winner.equals("Computer"))
                computerWin++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        String[][] stats = calculateStats(userWin, computerWin, games);
        displayResults(gameResults, stats);

        input.close();
    }
}
