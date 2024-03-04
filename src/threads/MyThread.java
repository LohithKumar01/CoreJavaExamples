package threads;

public class MyThread implements  Runnable{

    private String name;

    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println( Thread.currentThread().getName() +  " - "  + this.name);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
