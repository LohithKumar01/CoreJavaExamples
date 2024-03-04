package threads;

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Sonu");
        MyThread myThread2 = new MyThread("Sai");

        Thread t1 = new Thread(myThread1);
        Thread t2 = new Thread(myThread2);

        t1.start();
        t2.start();

        System.out.println("Completed.");

    }
}
