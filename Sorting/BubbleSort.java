import java.io.*;
import java.util.Scanner;

public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int t = 0;  
        for(int i=0; i<n; i++){  
            for(int j=1; j<(n-i); j++){  
                if(arr[j-1] > arr[j]){
                    t = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = t;  
                }
            }
        }
    }
    
    public static void main(String a[]){  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
          
        bubbleSort(arr); 
         
        System.out.println("Sorted Array:");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}