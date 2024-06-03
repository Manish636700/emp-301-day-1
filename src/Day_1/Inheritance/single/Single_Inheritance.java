package Day_1.Inheritance.single;


class A
{
    void m()
    {
        System.out.println("single Day_1.Day_2.Inheritance 1");
    }
}
class B extends A
{
    void m1()
    {
       // super.m();
        System.out.println("single Day_1.Day_2.Inheritance 2");
    }
}

public class Single_Inheritance {

    public static void main(String[] args) {
        A a = new A();
        a.m();

        B b = new B();
        b.m1();
        b.m();
    }
}
