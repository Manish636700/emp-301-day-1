package Day_2.Polymorphism;

class A{
    int a = 10;
    int b = 20;
    int c = 30;
    public void sum()
    {
        int sum1 = a + b;
        System.out.println(sum1);
    }
    public void multi()
    {
        int sum1 = a * b * c;
        System.out.println(sum1);
    }

}

public class Method_Overloading {
    public static void main(String[] args) {
        A a = new A();
        a.sum();
        a.multi();
    }
}
