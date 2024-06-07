package Day_6.String;

import java.util.Scanner;

public class Convert_String_to_String_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.nextLine();

        String str[] = s.split(" ");

        for(String s1 : str)
        {
            System.out.print(s1+" ");
        }

    }
}
