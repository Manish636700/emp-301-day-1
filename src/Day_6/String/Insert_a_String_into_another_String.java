package Day_6.String;

import java.util.Scanner;

public class Insert_a_String_into_another_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();

        System.out.println("enter the index and String ");
        int x = sc.nextInt();
        String y = sc.nextLine();

        String result = s.substring(0,x+1)+" "+y+" "+s.substring(x+1);

        System.out.println(result);


    }
}
