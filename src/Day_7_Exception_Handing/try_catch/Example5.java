package Day_7_Exception_Handing.try_catch;

public class Example5 {
    public static void main(String[] args) {

        int i=50;
        int j=0;
        try
        {
            int c = i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println(i/(j+2));
        }
        finally {
            System.out.println("Done");
        }
    }
}
