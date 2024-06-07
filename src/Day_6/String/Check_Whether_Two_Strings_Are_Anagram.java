package Day_6.String;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Whether_Two_Strings_Are_Anagram  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s = sc.nextLine();

        System.out.println("Enter the second string");
        String t = sc.nextLine();

        char []ch = s.toCharArray();
        char []ch1 = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        boolean flag = true;

        if(ch.length != ch1.length)
            flag = false;
        else
        {
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i] != ch1[i])
                {
                    flag = false;
                }
            }
        }

        if(flag == true)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
