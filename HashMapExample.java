import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Map: " + map);
        System.out.println("Value for key 'A': " + map.get("A"));

        map.remove("A");
        System.out.println("Map after removing key 'A': " + map);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
