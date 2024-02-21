package classWork2.CriticialSectionProblem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int sharedVariable = 0;
    private Lock lock = new ReentrantLock();

    public void enterCriticalSection(int threadId) {
        lock.lock();
        try {
            System.out.println("Thread " + threadId + " entering critical section.");
            // Critical Section: Access and modify the shared resource
            sharedVariable++;
            System.out.println("Thread " + threadId + " modified shared variable: " + sharedVariable);
        } finally {
            System.out.println("Thread " + threadId + " exiting critical section.");
            lock.unlock();
        }
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;
    private int threadId;

    public MyThread(SharedResource sharedResource, int threadId) {
        this.sharedResource = sharedResource;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.enterCriticalSection(threadId);
            // Simulate some non-critical section work
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class CriticalSectionExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource, 1);
        MyThread thread2 = new MyThread(sharedResource, 2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
