package dd_LinkedList;

public class DoublyLinkedList {

    private class Node {
        private int value;
        private Node previous;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        size++;
        var newNode = new Node(item);
        if (first == null && last == null)
            first = last = new Node(item);
        else {
            Node previous_last = last;
            last.next = newNode;
            last = newNode;
            newNode.previous=previous_last;

        }
    }

    public void addFirst(int item) {
        size++;
        var newNode = new Node(item);
        if (first == null && last == null)
            first = last = new Node(item);
        else {
            Node previous_first = first;
            previous_first.previous = newNode;
            first = newNode;
            newNode.next= previous_first;
        }
    }

    public void deleteFirst(){
        size--;
        Node newFirst = first.next;
       first = null;
       newFirst.previous = null;
       first = newFirst;
    }

    public void deleteLast() {
        size--;
        Node newLast = last.previous;
        last = null;
        newLast.previous = null;
        last = newLast;

    }

    public int indexOf(int item){
        Node currentNode = first;
        int index = 0;
        while (currentNode.next != null) {
            if (currentNode.value == item)
                break;
            index++;
            currentNode = currentNode.next;
        }
        if (contains(item)==false) {
            index = -1;
        }
        return index;
    }

    public boolean contains(int item) {
        Node currentNode = first;
        Node nextNode;
        boolean containsItem = true;
        while (true) {
            if (currentNode.value == item) {
                containsItem=true;
                break;
            }
            if (currentNode.next == null) {
                containsItem=false;
                break;
            }
            nextNode = currentNode.next;
            currentNode=nextNode;
        }
        return containsItem;
    }

    public int returnSize(){
        return size;
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



}
