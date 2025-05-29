package Sec9LinkedListExercises;



public class Ex15PopMethod {

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.traverseSinglyLinkedList();
        System.out.println(s.remove(0));
        System.out.println(s.head.value);
        System.out.println(s.tail.value);
        s.traverseSinglyLinkedList();

    }

}
