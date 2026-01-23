import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // hashmap to store 
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("apple", 100);
        priceMap.put("banana", 40);
        priceMap.put("milk", 60);
        priceMap.put("bread", 50);

        // linkedhashmap 
        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        cart.put("apple", priceMap.get("apple"));
        cart.put("banana", priceMap.get("banana"));
        cart.put("milk", priceMap.get("milk"));
        cart.put("bread", priceMap.get("bread"));

        // treemap to sort items 
        TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedByPrice
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey()); 
        }

        // display items 
        System.out.println("cart order:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // display items sorted by price
        System.out.println("sorted by price:");
        for (Map.Entry<Integer, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> " + entry.getKey());
            }
        }
    }
}
