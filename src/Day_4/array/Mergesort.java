package Day_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array n ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array " + (i+1)+":");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array b ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array " + (i+1)+":");
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n+n1];
        int i=0;
        for(int b : arr)
        {
            arr2[i]=b;
            i++;
        }
        for(int b : arr1)
        {
            arr2[i]=b;
            i++;
        }
        Arrays.sort(arr2);
        for(int a : arr2)
        {
            System.out.print(a+"\t");
        }
    }
}
