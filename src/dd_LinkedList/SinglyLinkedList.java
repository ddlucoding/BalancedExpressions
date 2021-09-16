package dd_LinkedList;

import java.util.HashMap;
import java.util.Map;

public class SinglyLinkedList {
    private class Node {
        public int value;
        private Node next;

        public Node(int value) { this.value= value; }
    }
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        if (first == null && last == null) {
            first = last = new Node(item);
        }
        else {
            var newNode = new Node(item);
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast (int item) {
        if (first == null && last == null) {
            first = last = new Node(item);
        }
        else {
            var newNode = new Node(item);
            last.next = newNode;
            last = newNode;

        }
        size++;
    }

    public int[] toArray() {
        int[] returnArray = new int[size];
        Node currentNode = first;
        for (int index = 0; index< size; index++) {
            returnArray[index]=currentNode.value;
            currentNode=currentNode.next;
        }
        return returnArray;
    }

    public int returnSize() {
        return size;
    }

    public int[] reverseList() {
        //Puts every node in a hashmap
        Node currentNode = first;
        Map<Integer, Node> map = new HashMap<>();

        for (int index = 0; index<size; index++) {
            map.put(index, currentNode);
            currentNode=currentNode.next;
        }
        //Puts every value in a LinkedList
        var newList = new SinglyLinkedList();
        for (int key = 0; key<size; key++) {
            newList.addLast(map.get(size-1-key).value);
        }
        return newList.toArray();
    }

    public void reverseList2() {
        if (first==null && last==null) return;
        /*
        * [1,2,3,4,5]
        *  p c n
        *    p c n
        *
        * */
        var previous = first;
        var current = first.next;

        while (current!=null) {
            if (previous == first) {
                last = current;
            }
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }

    public int kTHNodeFromEnd(int index) {
        Node c = first;
        int target=-1;
        for (int i = 0; i<size; i++) {
            if (i == size-index) {
                target = c.value;
                break;
            }
            c=c.next;
        }
        return target;
    }

    public int printMiddle() {
        Node returnNode = new Node(-1);
        if (size % 2 == 1) {
            var currentNode = first;
            int counter = 1;
            while (counter!=(size+1)/2) {
                counter++;
                currentNode=currentNode.next;
            }
            returnNode=currentNode;
        }
        else {

        }
        return returnNode.value;

    }
}
