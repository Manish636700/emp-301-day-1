package Day_2.Interface.multiple_Inheritance;

interface A {
    int sum();
}
interface B
{
    int mul();
}
class C implements A,B{
    public int sum() {
        return 5+6;
    }
    public int mul() {
        return 5*6;
    }
}

public class main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.sum());
       System.out.println(c.mul());
    }
}
