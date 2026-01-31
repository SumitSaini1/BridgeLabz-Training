public class SSNValidator {
    public static void main(String[] args) {

        String[] ssns = {
            "123-45-6789",
            "123456789"
        };

        String ssnRegex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        for (String ssn : ssns) {
            if (ssn.matches(ssnRegex)) {
                System.out.println("✅ \"" + ssn + "\" is valid");
            } else {
                System.out.println("❌ \"" + ssn + "\" is invalid");
            }
        }
    }
}
