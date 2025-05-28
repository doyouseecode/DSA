package Sec8SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void addFirst(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        } else {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        size++;
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

    public boolean searchNode(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean deleteFirstNode() {
        if (head == null) {
            System.out.println("The SLL doesn't exist");
            return false;
        } else {
            head = head.next;
            size--;
            if (size == 0) {
                tail = head;
            }
            return true;
        }
    }

    public boolean deleteLastNode() {
        if (head == null) {
            System.out.println("The SLL doesn't exist");
            return false;
        } else {
            Node temp = head;
            Node secondToLast = null;
            for (int i = 0; i < size; i++) {
                if (temp.next == null) {
                    break;
                }
                secondToLast = temp;
                temp = temp.next;
            }
            if (secondToLast != null) {
                secondToLast.next = null;
            }
            tail = secondToLast;
            size--;
            if (size == 0) {
                head = tail;
            }
            return true;
        }
    }

    public boolean deleteNode(int location) {
        if (head == null || location > size) {
            return false;
        } else if (location == 0) {
            return deleteFirstNode();
        }
        else if(location==size-1){
            return deleteLastNode();
        }
        else {
            Node temp = head;
            Node secondToLast = null;
            for (int i = 0; i < location; i++) {
                secondToLast = temp;
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }
            if (secondToLast != null) {
                secondToLast.next = temp.next;
                if (tail == temp) {
                    tail = secondToLast;
                }
            }
            size--;
            if (size == 0) {
                head = tail;
            }
            return true;
        }
    }

    public void deleteSinglyLinkedList(){
        head = null;
        tail = null;
        System.out.println("Singly Linked List has been deleted successfully");
    }

}
