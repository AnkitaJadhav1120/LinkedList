//program to perform basic operations on LinkedList
public class LinkedList {
    //creating a Node class
    public static class Node{
        int data;
        Node next;

        //constructor for passing values
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //function to add the elements from start(head) of ll
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //function to add elements from last(tail)
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;      //TC = O(1)
            return;
        }
        tail.next= newNode;
        tail = newNode;
    }
    //function to remove the elements from first
    public void removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return;
        }else if(size == 1){
            size = 0;
            head = tail = null;
            return;
        }
        head = head.next;
        size--;

    }
    //function to print the elements
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(12);
        ll.addFirst(11);
        ll.addLast(13);
        ll.addLast(14);
        ll.print();
        ll.removeFirst();
        ll.print();

    }
}
