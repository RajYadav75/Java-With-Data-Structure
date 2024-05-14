package MultiThreading.ThreadsGroups;

public class Test1 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Current ThreadGroup Name : "+name);
        System.out.println("==============================");
        String parentName = Thread.currentThread().getThreadGroup().getParent().getName();
        System.out.println("Parent ThreadGroup Name : "+parentName);
    }
}
