package MultiThreading.ThreadsGroups;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("------------------------");
        ThreadGroup tg = new ThreadGroup("Sub Thread Group");
        Thread t1 = new Thread(tg, "Raj Thread");
        t1.start();

        Thread t2 = new Thread(tg, "Deepak Thread");
        t2.start();

        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        tg.setMaxPriority(7);
        System.out.println("------------------------");
        System.out.println(tg.getMaxPriority());
        System.out.println(t1.getPriority());
        System.out.println("------------------------");
        ThreadGroup sub_tg = new ThreadGroup(tg, "Sub-Sub-ThreadGroup");
        System.out.println(sub_tg.getMaxPriority());

    }
}
