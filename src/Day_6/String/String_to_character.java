package Day_6.String;

import java.util.Scanner;

public class String_to_character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        char ch[] = s.toCharArray();
        for(char a : ch)
        {
            System.out.print(a+" ");
        }
    }
}
