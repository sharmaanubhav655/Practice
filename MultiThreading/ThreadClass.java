package MultiThreading;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Class");
    }

    public static void main(String[] args) {
        ThreadClass obj = new ThreadClass();
        obj.start();
    }
}
