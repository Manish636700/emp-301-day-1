package Day_5.array;

import java.util.Scanner;

public class find_largest_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int a : arr)
        {
            if(max<a)
            {
                max=a;
            }
        }
        System.out.println(max);
    }
}
