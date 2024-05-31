package Day_2.Abstract.Example2;

abstract class A
{

    A()
    {
        System.out.println("A is start");
    }
    int a = 5;
    {
        System.out.println("a" + "=" +a);
    }
    abstract void show();
    abstract int sum();
    void display()
    {
        System.out.println("class A running ");
    }
}
class B extends A
{
    @Override
    void show() {
        System.out.println("B running ");
    }

    @Override
    int sum() {
        return 0;
    }
}
public class main {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
        System.out.println(b.sum());
    }
}
