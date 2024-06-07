package Day_5.array;

import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        System.out.print("Enter the size of the element rotated : ");
        int d = sc.nextInt();

        int[] arr = new int[n];
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the elements " +(i+1) + " :");
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = d; i < n; i++)
        {
            arr1[index] = arr[i];
            index++;
        }
        for(int i = 0; i<d; i++)
        {
            arr1[index] = arr[i];
            index++;
        }

        for(int a : arr1)
        {
            System.out.print(a + " ");
        }

    }
}
