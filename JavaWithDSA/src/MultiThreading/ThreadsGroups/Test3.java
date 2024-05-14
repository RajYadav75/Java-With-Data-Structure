package MultiThreading.ThreadsGroups;

public class Test3 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("main-sub-thread-group");

        Thread t1 = new Thread(tg, "Raj thread");
        Thread t2 = new Thread(tg, "Deepak thread");

        t1.start();
        t2.start();
        System.out.println(tg.activeCount()); //2 thread active
        System.out.println(tg.getParent().activeCount());// 1 thread are active

        System.out.println(tg.activeGroupCount());  // 0
        System.out.println(tg.getParent().activeGroupCount()); //  1
        System.out.println(tg.getParent().getParent().activeGroupCount()); //2

    }
}
