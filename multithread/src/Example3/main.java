package Example3;

class myThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class main {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.run();

        myThread t2 = new myThread();
        Thread t3 = new Thread(t2);
        t3.start();

    }
}
