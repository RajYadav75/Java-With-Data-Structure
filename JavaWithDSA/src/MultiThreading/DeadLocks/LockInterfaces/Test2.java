package MultiThreading.DeadLocks.LockInterfaces;

import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        ReentrantLock re = new ReentrantLock();
        re.lock();
        re.lock();
        re.lock();
        re.lock();

        System.out.println(re.getHoldCount());

        System.out.println(re.isLocked());
        re.unlock();
        re.unlock();
        re.unlock();
        re.unlock();
        System.out.println(re.isLocked());
    }
}
