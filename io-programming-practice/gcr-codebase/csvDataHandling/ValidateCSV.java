package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class ValidateCSV {

    
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private static final String PHONE_REGEX =
            "^[1-9][0-9]{9}$";

    
    static void validateRow(String line, int rowNumber) throws InvalidInputException {

        
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        String[] columns = line.split(",");


        if (columns.length < 6) {
            throw new InvalidInputException(
                    "Row " + rowNumber + ": Invalid column count");
        }

        String email = columns[4].trim();
        String phone = columns[5].trim();

        if (!email.matches(EMAIL_REGEX)) {
            throw new InvalidInputException(
                    "Row " + rowNumber + ": Invalid Email -> " + email);
        }

        if (!phone.matches(PHONE_REGEX)) {
            throw new InvalidInputException(
                    "Row " + rowNumber + ": Invalid Phone -> " + phone);
        }


        System.out.println("VALID ROW [" + rowNumber + "] : " + line);
    }

    public static void main(String[] args) {

        String filePath =
                "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv";

        int rowNumber = 1; 

        try (BufferedReader bfr = new BufferedReader(new FileReader(filePath))) {

            bfr.readLine();

            String line;
            while ((line = bfr.readLine()) != null) {
                rowNumber++;
                try {
                    validateRow(line, rowNumber);
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
