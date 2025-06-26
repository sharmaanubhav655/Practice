package MultiThreading;

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable obj = () -> System.out.println("Runnable Interface");
        new Thread(obj).start();
    }
}
