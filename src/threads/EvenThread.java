package threads;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Even Threads - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
