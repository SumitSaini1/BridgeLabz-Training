public class ProfitLoss {
    public static void findProfit() {
        int sellingPrice = 191;
        int costPrice = 129;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100) / costPrice;
        System.out.print("The Cost Price is INR 129 and Selling Price is INR 191 " +
                "\nThe Profit is INR, " + profit + ", and the Profit Percentage is " + profitPercent);
    }
    public static void main(String[] args) {
        ProfitLoss.findProfit();

    }
    
}
