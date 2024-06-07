package Day_6.String;

import java.util.Scanner;

public class print_Even_length_words {
    public static void main(String[] args) {
        String s = "This is a java Language";

        for(String a : s.split(" "))
        {
            if(a.length()%2==0)
            {
                System.out.println(a);
            }
        }


    }
}
