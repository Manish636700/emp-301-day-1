package Day_7_Exception_Handing.try_catch;

public class Example2 {
    public static void main(String[] args) {
     try {
         int a[] = new int[5];
         System.out.println(a[5]);
     }
     catch (Exception e) {
         System.out.println(e);
     }

    }

}
