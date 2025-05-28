package Sec8SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(8,4);
        sLL.insertInLinkedList(9,0);
        sLL.traverseSinglyLinkedList();
        System.out.println(sLL.searchNode(66));

    }
}
