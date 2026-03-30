package CinemaTime;
import java.util.*;

public class CinemaTime {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> movieTimes = new ArrayList<>();

    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format! Use HH:MM (00–23):(00–59)");
        }

        movieTitles.add(title);
        movieTimes.add(time);
        System.out.println("Movie added successfully.");
    }

    // Search movie using contains()
    public void searchMovie(String keyword) {
        boolean found = false;

        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(
                        String.format("Found: %s - Show Time: %s",
                                movieTitles.get(i), movieTimes.get(i))
                    );
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No movie found with keyword: " + keyword);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error accessing movie list.");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println(" Movie Schedule:");
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(
                (i + 1) + ". " + movieTitles.get(i) + " - Show Time: " + movieTimes.get(i)
            );
        }
    }

    // Convert List to Array (for report)
    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = movieTimes.toArray(new String[0]);

        System.out.println("Printable Movie Report:");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(
                String.format("Movie: %s | Time: %s", titlesArray[i], timesArray[i])
            );
        }
    }

    // Time validation method
    private boolean isValidTime(String time) {
        return time.matches("([01]\\d|2[0-3]):[0-5]\\d");
    }
}
