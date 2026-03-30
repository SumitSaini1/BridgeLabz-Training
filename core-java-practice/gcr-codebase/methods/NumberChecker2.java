import java.util.Arrays;

public class NumberChecker2 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // frequency
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Main method
    public static void main(String[] args) {

        int number = 21;

        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits Count: " + countDigits(number));
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
    }
}
