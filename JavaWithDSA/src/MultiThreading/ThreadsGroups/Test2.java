package MultiThreading.ThreadsGroups;

public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("main-sub-thread-group");

        Thread t1 = new Thread(tg, "Raj thread");
        Thread t2 = new Thread(tg, "Deepak thread");

        System.out.println("Current ThreadGroup Name : "+tg.getName());
        System.out.println("Parent ThreadGroup Name : "+tg.getParent().getName());


        t1.start();
        t2.start();
        System.out.println(tg.activeCount());
        System.out.println("Old priority "+tg.getMaxPriority());
        tg.setMaxPriority(7);
        System.out.println("New priority "+tg.getMaxPriority());
        tg.list();// it will print the thread group information
    }
}
