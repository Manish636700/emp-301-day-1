package Day_7_Exception_Handing.try_catch;

public class Example1 {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
