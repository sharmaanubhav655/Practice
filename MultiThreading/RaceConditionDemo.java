package MultiThreading;

public class RaceConditionDemo {
    private static int count = 0;

    public static synchronized void increment() {
        count++; // Not atomic — race condition can occur here
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) RaceConditionDemo.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) RaceConditionDemo.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + RaceConditionDemo.count);
    }
}
