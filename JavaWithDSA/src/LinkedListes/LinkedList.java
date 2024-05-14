package LinkedListes;

public class LinkedList {
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
    public static int size = 1;


    // Add First In Linked List
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
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
        size++;
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
    // Add in the Middle in Linked List
    public void add(int idx, int data){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // Remove First in A Linked List
    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //Remove Last In Linked List

    public int removeLast(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev -i = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i ++){
            prev = prev.next;
        }
        int val = prev.next.data;; // tail.data
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }

    public int search(int key){ // Iterative approach
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recuursiveSearch(int key){  //recursive approach
        return helper(head, key);
    }
    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1){
            return -1;
        }
        return idx + 1;
    }

    // Reverse a Linked List
    public void reverse(){
        Node prev = null;
        Node curr= tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.head = new Node(1);
//        ll.head.next = new Node(2);

        ll.addFirst(11);
        ll.addFirst(12);
        ll.addLast(13);
        ll.addLast(14);
        ll.add(2,9);
//        ll.removeFirst();
//        ll.removeLast();
        ll.print();
//        System.out.println(ll.size);
        System.out.println(ll.search(3));
        System.out.println(ll.search(13));
        System.out.println(ll.recuursiveSearch(14));
        System.out.println(ll.recuursiveSearch(1));
        ll.reverse();
        ll.print();
    }
}
