package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> names = new ArrayList<>();
        Collection<String> names2 = new ArrayList<>();

        names2.addAll(names);
        Collections.addAll(names, "Daniel", "David", "Sophia", "Teddy Betty");
        names.add("Gabriel Li");
        System.out.println(names);
        System.out.println(names.contains("Daniel"));
        System.out.println(names == names2);
    }
}
