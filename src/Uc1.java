public class Uc1 {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);


        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }


    public void display() {

        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Uc1 sList = new Uc1();

        sList.addNode(56);
        sList.addNode(30);
        sList.addNode(70);


        sList.display();
    }
}
