package Sec10CircularSinglyLinkedList;

import com.sun.security.jgss.GSSUtil;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size++;
        return node;
    }

    public Node addFirst(int nodeValue){
        if(size==0){
            return createCircularSinglyLinkedList(nodeValue);
        }
        else{
            Node node = new Node();
            node.value = nodeValue;
            node.next = head;
            head = node;
            tail.next = head;
            size++;
            return node;
        }
    }

    public Node addLast(int nodeValue){
        if(size==0){
            return createCircularSinglyLinkedList(nodeValue);
        }
        else{
            Node node = new Node();
            node.value = nodeValue;
            tail.next = node;
            node.next = head;
            tail = node;
            size++;
            return node;
        }
    }

    // Conditions
    // Empty list
    // Single element list
    // Multiple elements in the list

    // Insert first
    // Insert last
    // Insert in the middle
    public Node insertNode(int nodeValue, int index){
        if(size==0){
            return createCircularSinglyLinkedList(nodeValue);
        }
        else if(index<=0){
            return addFirst(nodeValue);
        }
        else if(index>=size){
            return addLast(nodeValue);
        }
        else{
            Node current = head;
            for (int i = 0; i < index-1; i++){
                current = current.next;
            }
            Node node = new Node();
            node.value = nodeValue;
            node.next = current.next;
            current.next = node;
            size++;
            return node;
        }
    }

    public void traverseList(){
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node findNode(int nodeValue){
        Node current = head;
        for (int i = 0; i < size; i++){
            if(current.value == nodeValue){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Empty list
    // Single element list
    // Full list

    // Delete 1st element - done
    // Delete mid element -
    // Delete last element - done
    public Node deleteNode(int nodeValue){
        if(size==0){
            return null;
        }
        else if(head.value == nodeValue){
            Node temp = head;
            tail.next = head.next;
            head = head.next;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
        else{
            Node current = head;
            Node removing;
            for (int i = 0; i < size; i++){
                if(current.next.value == nodeValue){
                    if(tail == current.next){
                        removing = current.next;
                        current.next = current.next.next;
                        tail = current;
                    }
                    else{
                        removing = current.next;
                        current.next = current.next.next;
                    }
                    size--;
                    return removing;
                }
                current = current.next;
            }
        }
        return  null;
    }

}
