package Day_6.String;

import java.util.Scanner;

public class string_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        boolean palindrome = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!= s.charAt(s.length()-1-i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("Is a palindrome");
        }
        else
        {
            System.out.println("Is not a palindrome");
        }


    }
}
