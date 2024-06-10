package Day_7_Exception_Handing.try_catch;

public class Example3 {
    public static void main(String[] args) {
        try{
            System.out.println("try block");
            String s1="abc";
            int a = Integer.parseInt(s1);
        }
        catch(Exception e){
            System.out.println("NumberFormatException");
        }
        System.out.println("finally block");
    }
}
