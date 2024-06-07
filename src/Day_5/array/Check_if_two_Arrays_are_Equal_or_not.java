package Day_5.array;

import java.util.Scanner;

public class Check_if_two_Arrays_are_Equal_or_not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the first array element " + (i+1) + ": ");
           arr[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.print("Enter the first array element " + (i+1) + ": ");
            arr1[i] = sc.nextInt();
        }
        boolean flag = true;

        if(arr.length!=arr1.length)
            flag = false;
        else
        {
           for(int i=0;i<arr.length;i++)
           {
               if(arr[i]!=arr1[i])
                   flag = false;
           }
        }

        if(flag==false)
            System.out.println("The arrays are not equal");
        else
            System.out.println("The arrays are equal");

    }
}
