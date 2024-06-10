package Day_7_Exception_Handing.Throws;

public class Example2 {
    public static void method()throws ArithmeticException{
        throw new ArithmeticException("Arithmetic Exception");
    }
    public static void main(String[] args) {
        try
        {
            method();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
