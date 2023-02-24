package Recursion;

public class Subset_sum {
    int countSets(int arr[], int n, int sum) {
        if(n==0) {
            return (sum==0) ? 1 : 0;
        }
        return countSets(arr, n-1, sum) +
        countSets(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args) {
        Subset_sum obj = new Subset_sum();
    }
}
