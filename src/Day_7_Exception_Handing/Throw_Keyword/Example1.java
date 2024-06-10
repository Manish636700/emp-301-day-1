package Day_7_Exception_Handing.Throw_Keyword;

public class Example1 {
    public static void abc(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Arithmetic Exception");
        }
        else
        {
            System.out.println(age);
        }
    }
    public static void main(String[] args) {
        try
        {
            abc(10);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("age");
    }
}
