package threads;

public class ThreadExampleMain {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        Thread thread = new Thread(new EvenThread());
        oddThread.start();
        thread.start();
    }
}
