package Day_4.array;

import java.util.Scanner;

public class search {
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

        System.out.println("Enter the element to search ");
        int ele = sc.nextInt();

       for(int i=0;i<n;i++)
       {
           if(arr[i]==ele)
           {
               System.out.println("Element found at index "+(i+1));
           }
       }
    }
}
