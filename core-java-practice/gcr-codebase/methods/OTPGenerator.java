import java.util.Arrays;

public class OTPGenerator {

    // method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // method to check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all otp are unique
    }

   
    public static void main(String[] args) {

        int[] otps = new int[10];

        // generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // display Otps
        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otps));

        // check uniqueness
        boolean isUnique = areOTPsUnique(otps);

        if (isUnique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
