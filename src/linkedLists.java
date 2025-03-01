

public class linkedLists {

    static Node head = null;
    static Node tail = null;

    public static void addNodeAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.next = null;
            tail = node;
        }

    }

    public static void addNodeAtIndex(int val, int index) {
        int count = 1;
        Node current = head;
        while (current != null && count != index-1) {
            current = current.next;
            count++;
        }

        Node newNode = new Node(val);
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }

    public static void removeNodeAtEnd() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    public static void removeFirstNode() {
        head = head.next;

    }

    public static void addNodeAtGivenIndex(int val, int index) {
        int count = 1;
        Node current = head;
        while (current != null && count != index-1) {
            current = current.next;
            count++;
        }
        Node newNode = new Node(val);
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }

    public static void deleteNodeAtGivenValue(int value) {
        if (head.val == value) {
            removeFirstNode();
        }
        else if (tail.val == value) {
            removeNodeAtEnd();
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.val != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            throw new RuntimeException("the node with the given value is not found!!");
        }

        previous.next = current.next;

    }

    public static void deleteEvenValueNodes() {
        Node current = head;
        while (current != null) {
            if (current.val %2 == 0) {
                deleteNodeAtGivenValue(current.val);
            }
            current = current.next;
        }
    }

    public static void deleteNodeAtGivenIndex(int index) {
        int count = 1;
        Node current = head;
        if (index == 1) {
            current = head.next;
            head = current;
        }
        else{
            while (current != null && count != index-1) {
                current = current.next;
                count++;
            }

            current.next = current.next.next;

        }

    }

    public static void main(String[] args) {
        addNodeAtEnd(10);
        addNodeAtEnd(20);
        addNodeAtEnd(30);
        addNodeAtEnd(40);
        printLinkedList(head);
        System.out.println("***********");
        addNodeAtIndex(75, 3);
        printLinkedList(head);
        System.out.println("***********");
        System.out.println("Removing last node");
        removeNodeAtEnd();
        printLinkedList(head);
        System.out.println("Removing first node");
        removeFirstNode();
        printLinkedList(head);
        System.out.println("Adding 80 at index 2");
        addNodeAtGivenIndex(80,2);
        printLinkedList(head);
        System.out.println("Deleting Node at index 3");
        deleteNodeAtGivenIndex(3);
        printLinkedList(head);
    }

    public static void printLinkedList(Node headNode) {
        Node current = headNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }
}

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
    }
}

