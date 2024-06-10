package Day_7_Exception_Handing.try_catch;

public class Example4 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        try
        {
            int c = i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("finally");
        }
    }
}
