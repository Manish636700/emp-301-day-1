package Day_4.array;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" ");
            arr[i] = sc.nextInt();
        }
        boolean palindrome = true;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                palindrome = false;
            }
        }
        System.out.println(palindrome);
    }
}
