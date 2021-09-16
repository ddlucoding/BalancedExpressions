package dd_LinkedList;

public class Linked_List_Main {

    public static void main(String[]args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(5);
        list.addLast(10);


        System.out.println(list.printMiddle());
    }


}
