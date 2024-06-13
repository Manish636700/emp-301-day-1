package Example6;

class myThread extends Thread{
    @Override
    public void run() {
        System.out.println(" hello thread");
    }
}
public class main {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.setDaemon(true);
        t1.start();
    }
}
