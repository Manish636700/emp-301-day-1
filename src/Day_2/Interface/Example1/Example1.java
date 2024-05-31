package Day_2.Interface.Example1;

interface A
{
    void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("Interface Example 1");
    }
}
public class Example1 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
