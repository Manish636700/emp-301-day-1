package Day_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class smax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+"th element");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int smax = arr[0];
       // Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
            if(Math.abs(arr[i]) >Math.abs(max)) {
                smax = max;
                max = arr[i];
            }
            else if(Math.abs(arr[i]) >Math.abs(smax) && Math.abs(arr[i])!=Math.abs(max)) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
