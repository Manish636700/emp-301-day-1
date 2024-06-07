package Day_5.array;

import java.util.Scanner;

public class Array_Copy_in_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the elements " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        int [] arrCopy = new int[arr.length];
        int i=0;
        for(int a : arr)
        {
            arrCopy[i] = a;
            i++;
        }

        for(int a : arrCopy)
        {
            System.out.print(a+"\t");
        }
    }
}
