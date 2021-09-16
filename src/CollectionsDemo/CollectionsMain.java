package CollectionsDemo;

import java.util.*;

public class CollectionsMain {
    public static void main(String []args) {
        var c1 = new Customer("John", "e1");
        var c2 = new Customer("Adam", "e2");
        var c3 = new Customer("Caeleb", "e3");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(),c2);
        map.put(c3.getEmail(), c3);

        System.out.println(map);

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
