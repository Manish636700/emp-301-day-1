package Day_7_Exception_Handing.Exception_propagation;

public class Example2 {
    void m()
    {
        throw new ArithmeticException("ArithmeticException");
    }
    void n()
    {
         m();
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");


    }
    void method()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.method();
    }
}
