package Day_7_Exception_Handing.Throws;

public class Example1 {
    public static class Throws {
        public static void method(int a)throws ArithmeticException{
            int b = a/0;
        }
        public static void main(String[] args) {
            try
            {
                method(10);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
