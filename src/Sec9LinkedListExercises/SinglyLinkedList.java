package Sec9LinkedListExercises;

import Sec8SinglyLinkedList.Node;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public void push(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public Node pop() {
        Node removing;
        if (size == 0 || size == 1) {
            head = null;
            removing = tail;
            tail = null;
            size = 0;
        } else {
            removing = head;
            Node secondToLast = head;
            while (removing.next != null) {
                secondToLast = removing;
                removing = removing.next;
            }
            secondToLast.next = null;
            tail = secondToLast;
            size--;
        }
        return removing;
    }

    public void traverseSinglyLinkedList() {
        if (head != null) {
            Node head = this.head;
            while (head != null) {
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println();
        }
        else{
            System.out.println("SLL doesn't exist!");
        }
    }


    public boolean insert(int data, int index) {
        Node node;
        if(index<0 || index >= size){
            return false;
        }
        else if(index == 0){
            node = new Node();
            node.value = data;
            node.next = head;
            head = node;
            size++;
            return true;
        }
        node = new Node();
        node.value = data;
        Node prior = head;
        Node temp = head;
        int i = 0;
        while(i<index){
            i++;
            prior = temp;
            temp=temp.next;
        }

        node.next = temp;
        prior.next=node;
        size++;
        return true;
    }
}
