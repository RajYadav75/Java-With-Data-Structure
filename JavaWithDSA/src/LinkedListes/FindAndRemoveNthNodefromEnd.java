package LinkedListes;

public class FindAndRemoveNthNodefromEnd {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        // Step 1 -> Create New Node

        // Step 2 -> NewNode.next = head
        newNode.next = head; //link
        // Step 3 -> newNode;
        head = newNode;
    }
    // Add Last In Linked List
    public void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print a linked List
    public void print(){
        if (head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthfromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if (n == size){
            head = head.next; //removeFirst
            return;
        }
        //size -n
        int i = 1;
        int iToFind = size -n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        FindAndRemoveNthNodefromEnd ll = new FindAndRemoveNthNodefromEnd();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.addLast(14);
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
