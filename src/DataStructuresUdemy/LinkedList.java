package DataStructuresUdemy;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
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

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
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
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void merge(LinkedList otherList) {
        Node pointerOther = otherList.head;
        Node pointerThis = this.head;
        while(pointerThis != null && pointerOther != null) {
            if(pointerThis.value <= pointerOther.value) {
                pointerThis = pointerThis.next;
            } else {
                Node newNode = new Node(pointerThis.value);
                newNode.next = pointerThis.next;
                pointerThis.next = newNode;
                pointerThis.value = pointerOther.value;
                pointerOther = pointerOther.next;
                pointerThis = pointerThis.next;
            }
        }
        while(pointerOther != null) {
            pointerThis = new Node(pointerOther.value);
            if(pointerOther.next == null) this.tail = pointerThis;
            pointerOther = pointerOther.next;
            pointerThis = pointerThis.next;
        }
        this.length += otherList.length;
    }


}


