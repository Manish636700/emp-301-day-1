package Day_7_Exception_Handing.Exception_propagation;

public class Example1 {
    void m()
    {
        int a = 1/0;
    }
    void n()
    {
        m();
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
        Example1 obj = new Example1();
        obj.method();
    }
}
