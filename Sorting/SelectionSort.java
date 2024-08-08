import java.io.*;
import java.util.Scanner;

public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i=0; i<arr.length-1; i++)  
        {  
            int curr_index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[curr_index]){  
                    curr_index = j;
                }  
            }  
            int small_num = arr[curr_index];   
            arr[curr_index] = arr[i];  
            arr[i] = small_num;  
        }  
    }  
       
    public static void main(String a[]){  
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
          
        selectionSort(arr); 
         
        System.out.println("Sorted Array:");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }
    }
}