package Sec10CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList circular = new CircularSinglyLinkedList();
        circular.addLast(15);
        circular.addLast(23);
        circular.addLast(14);
        circular.addLast(95);

        circular.deleteNode(95);
        System.out.println(circular.size);
        System.out.println(circular.head);
        System.out.println(circular.tail);
        circular.traverseList();

    }
}
