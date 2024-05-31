package Day_2.Abstract.Example1;

abstract class A{
    abstract void run();
}
class B extends A{
    public void run(){
        System.out.println("running");
    }
}
public class main {
    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
