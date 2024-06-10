package Day_7_Exception_Handing.Nested_try_block;

public class Example2 {
    public static void main(String[] args) {
            try {
                System.out.println("try block 1");
                try {
                    System.out.println("try block 2");
                    int b[] = new int[5];
                    System.out.println(b[5]);
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

