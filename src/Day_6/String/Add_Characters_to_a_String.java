package Day_6.String;

import java.util.Scanner;

public class Add_Characters_to_a_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);
        System.out.println(s+ch);



    }
}
