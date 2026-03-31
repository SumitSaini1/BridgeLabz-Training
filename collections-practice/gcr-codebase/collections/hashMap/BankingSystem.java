import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        // hashmap to store account number and balance
        HashMap<Integer, Integer> accounts = new HashMap<>();
        accounts.put(101, 5000);
        accounts.put(102, 12000);
        accounts.put(103, 3000);
        accounts.put(104, 8000);

        // queue to process 
        Queue<int[]> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add(new int[]{101, 2000}); 
        withdrawalQueue.add(new int[]{103, 1000});
        withdrawalQueue.add(new int[]{102, 5000});

        // withdrawals
        while (!withdrawalQueue.isEmpty()) {
            int[] request = withdrawalQueue.remove();
            int accNo = request[0];
            int amount = request[1];

            if (accounts.containsKey(accNo) && accounts.get(accNo) >= amount) {
                accounts.put(accNo, accounts.get(accNo) - amount); // deduct balance
            }
        }

        // treemap to sort customers 
        TreeMap<Integer, List<Integer>> sortedByBalance = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
            sortedByBalance
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey()); // group accounts by balance
        }

        // display customers 
        for (Map.Entry<Integer, List<Integer>> entry : sortedByBalance.entrySet()) {
            for (Integer acc : entry.getValue()) {
                System.out.println("account: " + acc + " balance: " + entry.getKey());
            }
        }
    }
}


