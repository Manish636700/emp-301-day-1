package Day_1.Polymorphism;


class B{
    int a = 10;
    int b = 20;
    //int c = 30;
    public void sum()
    {
        int sum1 = a + b;
        System.out.println(sum1);
    }
}
class C extends B{
    @Override
    public void sum() {
        super.sum();
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        C b = new C();
        b.sum();

        B a = new B();
        a.sum();
    }

}
