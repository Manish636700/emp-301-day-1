package Day_6.String;

import java.util.Scanner;

public class get_a_character_from_a_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        System.out.println("enter the index which character");
        int x = sc.nextInt();

        System.out.println(s.charAt(x));
    }
}
