package Day_7_Exception_Handing.Nested_try_block;

public class Example4 {
    public static void main(String[] args) {
        try {
            //inner try block 1
            try {
                //inner try block 2
                try {
                    String s1 = null;
                    System.out.println(s1.length());
                }
                catch (NullPointerException e) {
                    System.out.println(e);
                    System.out.println("NullPointerException");
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("finally block 1");
        }
    }
}
