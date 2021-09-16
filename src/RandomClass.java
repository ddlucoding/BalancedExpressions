import java.util.LinkedList;

public class RandomClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);
        var list2 = list.toArray();
    }

}
