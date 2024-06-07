package Day_6.String;

import java.util.Scanner;

public class Characters_in_a_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s = sc.nextLine();

       char ch[] = s.toCharArray();

        for(int i=0;i<ch.length-1;i=i+2)
        {
            char ch1=ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = ch1;
        }
        String s1 = String.valueOf(ch);

       System.out.println(s1);

    }
}
