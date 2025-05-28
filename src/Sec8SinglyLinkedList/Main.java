package Sec8SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,3);
        sLL.addLast(12);
        sLL.addLast(99);
        sLL.traverseSinglyLinkedList();
        sLL.deleteNode(4);

//        System.out.println(sLL.size);
//        sLL.traverseSinglyLinkedList();
//        System.out.println(sLL.searchNode(66));
//        System.out.println(sLL.deleteFirstNode());

//        sLL.deleteLastNode();
//        System.out.println(sLL.head);
//        System.out.println(sLL.tail);
//        System.out.println(sLL.size);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSinglyLinkedList();
        sLL.traverseSinglyLinkedList();
    }
}
