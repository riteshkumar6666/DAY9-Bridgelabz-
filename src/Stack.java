
public class Stack {

    public Node head;
    public Node tail;

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();

    }

}