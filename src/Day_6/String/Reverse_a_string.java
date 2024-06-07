package Day_6.String;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String s1 ="";

        for (int i = s.length()-1; i>=0; i--) {
            s1 += s.charAt(i);
        }

        System.out.println(s1);


    }
}
