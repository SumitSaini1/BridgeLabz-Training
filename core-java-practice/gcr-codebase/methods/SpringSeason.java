public class SpringSeason {

    // Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {

        // March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }

        // April and May 
        if (month == 4 || month == 5) {
            return true;
        }

        // June 1 to June 20
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Reading values from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call the method
        boolean result = isSpringSeason(month, day);

        // Display the outup
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
