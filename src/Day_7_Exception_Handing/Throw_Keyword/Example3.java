package Day_7_Exception_Handing.Throw_Keyword;

public class Example3 extends Exception {
    public Example3(String str)
    {
        super(str);
    }
    public static void main(String[] args) {

        try {
            throw new Example3("Exception");
        }
        catch (Example3 e) {
            System.out.println(e);
            System.out.println(e.getMessage());

        }
    }
}
