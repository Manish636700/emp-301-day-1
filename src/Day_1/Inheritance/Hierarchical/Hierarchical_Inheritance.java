package Day_1.Inheritance.Hierarchical;
class A1
{
    void m1()
    {
        System.out.println("Hierarchical_Inheritance 1");
    }
}
class A2 extends A1
{
    void m2()
    {
        System.out.println("Hierarchical_Inheritance 2");
    }
}

class A3 extends A2
{
    void m3()
    {
        System.out.println("Hierarchical_Inheritance 3");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m1();

        A2 a2 = new A2();
        a2.m2();
        a2.m1();

        A3 a3 = new A3();
        a3.m1();
        a3.m3();
    }


}
