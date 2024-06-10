package Day_7_Exception_Handing.Throw_Keyword;

public class Example2 {
    public static void method() throws ArrayIndexOutOfBoundsException,ArithmeticException {
        int arr[] = new int[5];
        arr[5]=1/0;



        throw new ArrayIndexOutOfBoundsException();


    }
    public static void main(String[] args) {
        try{
            method();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
