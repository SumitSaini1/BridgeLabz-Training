public class RichestCustomer {
    // to find maximum wealth
    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        int result = maximumWealth(accounts);
        System.out.println("Richest Customer Wealth: " + result);
    }
}
