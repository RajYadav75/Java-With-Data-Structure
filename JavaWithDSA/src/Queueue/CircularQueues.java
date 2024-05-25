package Queueue;

public class CircularQueues {
    static class Quesus{
        static int[] arr;
        static int size;
        static int front;
        static int rear;
        Quesus(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        //add
        public static void add(int data){
            if(isEmpty()){
                System.out.println("Queue is full");
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear){
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Quesus q = new Quesus(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
