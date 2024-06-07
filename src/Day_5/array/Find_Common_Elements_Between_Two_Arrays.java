package Day_5.array;

import java.util.*;

public class Find_Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first matrices");
        int n = sc.nextInt();

        //First array input
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+":");
            arr[i] = sc.next();
        }
        System.out.println("arr" + Arrays.toString(arr));
        //second array Input
        System.out.print("Enter the size of the Second matrices");
        int n1 = sc.nextInt();

        String arr1[] = new String[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.print("Enter the element "+(i+1)+":");
            arr1[i] = sc.next();
        }
        System.out.println("arr1" + Arrays.toString(arr1));

        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++) {
               if(arr[i].equals(arr1[j])) {
                   set.add(arr[i]);
                   break;
               }
            }
        }
     System.out.print(set);

    }
}
