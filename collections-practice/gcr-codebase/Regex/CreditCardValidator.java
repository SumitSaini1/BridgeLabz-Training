public class CreditCardValidator {
    public static void main(String[] args) {

        String[] cards = {
            "4111111111111111",
            "5112345678901234",
            "6111111111111111",
            "411111111111111"
        };

        String cardRegex = "^(4|5)\\d{15}$";

        for (String card : cards) {
            System.out.println(card + " → " + card.matches(cardRegex));
        }
    }
}
