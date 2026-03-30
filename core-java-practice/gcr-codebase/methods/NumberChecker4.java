public class NumberChecker4 {

    // method to find sum of proper divisors 
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // method to check perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // method to check abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // method to check deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

   
    public static void main(String[] args) {

        int number = 28;

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
