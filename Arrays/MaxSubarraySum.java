package Arrays;

public class MaxSubarraySum {
    // public int maxSum(int arr[], int n){
    //     int res = arr[0];
    //     for(int i=0; i<n; i++) {
    //         int curr = 0;
    //         for(int j=i; j<n; j++) {
    //             curr += arr[j];
    //             res = Math.max(curr, res); 
    //         }
    //     }
    //     return res;
    // }

    public int maxSum(int arr[], int n){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1; i<n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        MaxSubarraySum obj = new MaxSubarraySum();
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(obj.maxSum(arr, arr.length));
    }
}
