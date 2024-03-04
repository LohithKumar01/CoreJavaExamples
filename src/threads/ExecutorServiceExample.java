package threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);

        executorService.submit(new MyThread("Sasi"));
        executorService.submit(new MyThread("Sai"));
        executorService.submit(new MyThread("Sonu"));
        executorService.submit(new MyThread("Kavi"));
        executorService.submit(new MyThread("Pretty"));
        executorService.submit(new MyThread("sri"));

        executorService.shutdown();

        System.out.println("Completed");
    }
}
