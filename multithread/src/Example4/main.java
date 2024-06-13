package Example4;

class myThread extends Thread{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread Task1");
    }
    public void runs()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class main {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        t1.runs();
        System.out.println(Thread.currentThread().getName());
    }
}
