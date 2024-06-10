package Day_7_Exception_Handing.Throws;

public class Example3 {
    public static void main(String[] args)  {
        try
        {
            ExceptionExample3 ex = new ExceptionExample3();
            ex.method();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class ExceptionExample3 {
    public static void method() throws ArithmeticException
    {
       throw new ArithmeticException("Arithmetic Exception");
    }
}
