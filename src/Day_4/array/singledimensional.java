package Day_4.array;

import java.util.Scanner;

public class singledimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element "+(i+1)+" in the array");
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
