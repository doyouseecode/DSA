package Sec9LinkedListExercises;



public class Ex15PopMethod {

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.push(5);
        s.push(15);
        s.push(33);
        s.push(13);
        System.out.println(s.size);
        s.traverseSinglyLinkedList();
        System.out.println(s.insert(95,0));
        s.traverseSinglyLinkedList();
        System.out.println(s.size);

        // Failing
        // Case 1 = there are only 2 nodes = 5, 15
        // Insert 95, at 0


    }

}
