package Day_7_Exception_Handing.MultipleCatch;

public class Example3 {
    public static void main(String[] args) {
        try
        {
            int a = 1 / 0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
