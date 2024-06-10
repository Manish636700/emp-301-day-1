package Day_7_Exception_Handing.Nested_try_block;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("try block 1");
            int d = 1/0;
            System.out.println(d);

            try {
                System.out.println("try block 2");
                int b[] = new int[5];
                System.out.println(b[5]);
                try {
                    System.out.println("try block 3");
                    String s1 = null;
                    System.out.println(s1.length());
                    try {
                        System.out.println("try block 4");
                        int a = 1/0;
                        System.out.println(a);
                    }
                    catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                }
                catch (NullPointerException e) {
                    System.out.println(e);
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
