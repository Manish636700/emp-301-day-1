package Example2;

class Mythread1 extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("start thread 1 : - " + i);
        }
    }
}
class Mythread2 extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("start thread 2 : -" + i);
        }
    }
}
public class main {
    public static void main(String[] args) throws InterruptedException {
        Mythread1 t1 = new Mythread1();
        t1.start();

        Mythread2 t2 = new Mythread2();
        t2.start();

    }

}
