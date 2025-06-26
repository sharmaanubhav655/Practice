package MultiThreading;

public class ThreadClass {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread Created."));
        thread.start();
    }
}
