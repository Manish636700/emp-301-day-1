package Day_2.Interface.Example3;

interface A
{
   void sum();
  default void mes()
   {
       System.out.println("A interface");
   }

}
class B implements A
{
    @Override
    public void sum() {
        System.out.println("sum");

    }
}
public class main {
    public static void main(String[] args) {
        B b = new B();
        b.sum();
        b.mes();
    }
}
