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
            tail = node;
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
        // here eliminating index>=size
        // allows us to insert element after the tail
        if(index<0 || index > size) return false;

        Node node = new Node();
        node.value = data;

        if(index == 0){
            node.next = head;
            head = node;
        }
        else{
            Node current = head;
            for(int i = 0; i < index-1; i++){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }

        size++;
        return true;
    }

    public Node get(int index) {
        if(index < 0 || index >= size){
            return null;
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }

    public String rotate(int number){
        if(head == null || number >= size){
            return "WRONG INPUT";
        }
        for(int i = 0; i < number; i++){
            tail.next = head;
            head = head.next;
            tail = tail.next;
            tail.next = null;
        }
        return "Success";
    }

    public boolean set(int index, int value){
        if(head==null || index >= size){
            return false;
        }
        else{
            Node current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            current.value = value;
        }
        return true;
    }

    public Node remove(int index){
        Node toRemove;
        if(head == null || index >= size || index < 0){
            return null;
        }
        else if(size==1){
            toRemove = head;
            head = tail = null;
        }
        else if(index == 0){
            toRemove = head;
            head = head.next;
        }
        else{
            Node secondToLast = head;
            for(int i = 0; i < index-1; i++){
                secondToLast = secondToLast.next;
            }
            toRemove = secondToLast.next;
            secondToLast.next = secondToLast.next.next;
            if(toRemove==tail){
                tail = secondToLast;
            }
        }
        size--;
        return toRemove;
    }

}
