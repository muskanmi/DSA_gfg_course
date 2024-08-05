import java.io.*;
import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Declaring the array
        int arr[] = new int[n];
        
        // Reading array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Reading the element to be searched
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();
        
        // Function call
        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
        
        // Closing the scanner
        scanner.close();
    }
}
