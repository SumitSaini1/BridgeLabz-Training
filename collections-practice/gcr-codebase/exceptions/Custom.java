// custom exception for invalid age
class InvalidAgeException extends Exception {

    // constructor to pass message to parent exception class
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Custom {

    // method to validate age
    public static void validateAge(int age) throws InvalidAgeException {

        // checking if age is valid
        if (age >= 18) {
            System.out.println("access granted");
        } 
        // throwing custom exception if age is invalid
        else {
            throw new InvalidAgeException("age must be above 18 or equal");
        }
    }

    public static void main(String[] args) {
        try {
            // calling age validation method
            validateAge(18);
        } 
        // handling custom exception
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
