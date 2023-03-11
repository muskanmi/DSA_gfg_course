package Arrays;

import java.util.concurrent.CountDownLatch;

public class Frequency {
    // public void frequency(int arr[], int n){
    //     int visited = -1;
    //     int[] fr = new int[arr.length];
    //     for(int i=0; i<n; i++) {
    //         int count=1;
    //         for(int j=i+1; j<n; j++) {
    //             if(arr[i] == arr[j]){
    //                 count++;
    //                 fr[j] = visited;
    //             }
    //         }
    //         if(fr[i] != visited){
    //             fr[i] = count;
    //         }
    //     }

    //     for(int i=0; i<fr.length; i++) {
    //         if(fr[i] != visited) {
    //             System.out.println(arr[i] + " " + fr[i]);
    //         }
    //     }
    // }

    public void frequency(int arr[], int n) {
        int freq = 1; 
        int i=1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1] != arr[n-2]) {
            System.out.println(arr[n-1] + " " + 1);
        }
    }
    public static void main(String[] args) {
        Frequency obj = new Frequency();
        int arr[] = {10, 10, 10, 25, 30, 30};
        obj.frequency(arr, arr.length);
    }
}
