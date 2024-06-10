package Day_7_Exception_Handing.MultipleCatch;

public class Example2 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Hello try");
            System.out.println(5/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("done");
        }
    }
}
