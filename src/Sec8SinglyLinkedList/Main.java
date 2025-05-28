package Sec8SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(9,3);
        sLL.addLast(943);
        sLL.traverseSinglyLinkedList();
        System.out.println("\n"+sLL.findNode(93));


    }
}
