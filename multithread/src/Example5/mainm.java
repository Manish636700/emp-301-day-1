package Example5;

class myThread extends Thread{
    public void run() {
        System.out.println("myThread constructor");
        System.out.println(Thread.currentThread().getPriority());
    }
}
class main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        myThread t1 = new myThread();
        t1.setPriority(10);
        t1.start();
    }
}
