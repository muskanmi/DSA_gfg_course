package Arrays;

public class Max_difference {
    // public int maximun(int arr[], int n) {
    //     int res = arr[1] - arr[0];
    //     for(int i=0; i<n; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             res = Math.max(res, arr[j]-arr[i]);
    //         }
    //     }
    //     return res;
    // }

    public int maximum(int arr[], int n) {
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for(int i=0; i<n; i++) {
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Max_difference obj = new Max_difference();
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(obj.maximum(arr, arr.length)) ;
    }
}
