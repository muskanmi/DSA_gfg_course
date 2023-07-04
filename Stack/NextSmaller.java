package Stack;

import java.util.ArrayList;

public class NextSmaller {

    static void nextSmallerOfNextGreater(int arr[], int n) {
    ArrayList<Integer> vec = new ArrayList<Integer>();
 
    // For 1st n-1 elements of vector
    for(int i = 0; i < n - 1; i++) {
      int temp = arr[i];
      int next = -1;
      int ans = -1;
      for(int j = i + 1; j < n; j++) {
        if(arr[j] > temp) {
          next = j;
          break;
        }
      }
      if(next == -1) {
        vec.add(-1);
      }
      else {
        for(int j = next + 1; j < n; j++) {
          if(arr[j] < arr[next]) {
            ans = j;
            break;
          }
        }
        if(ans == -1) {
          vec.add(-1);
        }
        else {
          vec.add(arr[ans]);
        }
      }
    }
    vec.add(-1); // For last element of vector
 
    for(int x : vec) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 2, 5, 1, 7};
    int n = arr.length;
    nextSmallerOfNextGreater(arr, n);
    }
}
