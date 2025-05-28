package Sec8SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size=1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index < location -1 ){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void addFirst(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
        }
        else{
            node.next = null;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head!=null){
            Node head = this.head;
            while(head!=null){
                System.out.print(head.value + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

    public boolean searchNode(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.value == val) return true;
            temp = temp.next;
        }
        return false;
    }

}
