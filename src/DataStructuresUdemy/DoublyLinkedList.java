package DataStructuresUdemy;

public class DoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.printAll();
        doublyLinkedList.swapPairs();
        doublyLinkedList.printAll();
        doublyLinkedList.append(4);
        doublyLinkedList.swapPairs();
        doublyLinkedList.printAll();
    }

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    public void swapPairs() {
        if(this.length < 2) return;
        Node prev = this.head;
        Node next = prev.next;
        while(prev != null && next != null) {
            if(this.head == prev){
                this.head = next;
                next.prev = null;
                prev.prev = next;
                prev.next = next.next;
                next.next.prev = prev;
                next.next = prev;
            } else {
                prev.prev.next = next;
                next.prev = prev.prev;
                prev.prev = next;
                prev.next = next.next;
                if(next.next != null) {
                    next.next.prev = prev;
                }
                next.next = prev;
            }
            prev = prev.next;
            next = prev == null ? null : prev.next;
        }
    }

}