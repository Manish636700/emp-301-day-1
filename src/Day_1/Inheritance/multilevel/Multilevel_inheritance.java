package Day_1.Inheritance.multilevel;

class A
{
    void m1()
    {
        System.out.println("multilevel_inheritance 1");
    }
}
class B extends A
{
    void m2()
    {
        System.out.println("multilevel_inheritance 2");
    }
}
class C extends B
{
    void m3()
    {
        System.out.println("multilevel_inheritance 3");
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m2();
        b.m1();

        C c = new C();
        c.m2();
        c.m1();
        c.m3();

    }

}
