import java.util.*;

public class FrequencyofElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Banana");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (!map.containsKey(fruits.get(i))) {
                map.put(fruits.get(i), 1);

            } else {
                map.put(fruits.get(i), map.get(fruits.get(i)) + 1);
            }

        }
        System.out.println(map);
    }

}
