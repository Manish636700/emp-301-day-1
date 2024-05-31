package Day_2.Interface.Multiple_example_2;

interface A
{
    int sum();
    int mul();
}

interface B extends A
{
    void print();
}
class C implements B
{
    @Override
    public int sum() {
        return 0;
    }

    @Override
    public int mul() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(sum() + " " + mul());
    }
}
public class main {
    public static void main(String[] args) {
        C c = new C();
        c.print();
    }
}
