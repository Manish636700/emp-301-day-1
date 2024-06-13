package Example1;

class mythead extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }
}
public class Main {
    public static void main(String[] args) {

        mythead t = new mythead();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        ThreadGroup tg = new ThreadGroup("mygroup");
        Thread t1 = new Thread(tg,t, "t1");
        t1.start();

        Thread t2 = new Thread(tg,t, "t2");
        t2.start();


        System.out.println(tg.getName());
        tg.list();

    }
}