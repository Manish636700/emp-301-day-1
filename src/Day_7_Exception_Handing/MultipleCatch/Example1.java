package Day_7_Exception_Handing.MultipleCatch;

public class Example1 {
    public static void main(String[] args) {
        try
        {
            int a[] = new int[5];
            System.out.println(a[5]);
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
    }
}
