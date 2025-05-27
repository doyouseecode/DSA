package Sec8SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(9,3);
        System.out.println(sLL.head.next.next.value);

    }
}
