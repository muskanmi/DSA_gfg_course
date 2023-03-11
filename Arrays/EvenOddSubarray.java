package Arrays;

public class EvenOddSubarray {
    // public int maxEvenOdd(int arr[], int n){
    //     int res = 1;
    //     for(int i=0; i<n; i++) {
    //         int curr=1;
    //         for(int j=i+1; j<n; j++) {
    //             if((arr[j] % 2 == 0 && arr[j-1] % 2 != 0) ||
    //             (arr[j] % 2 != 0 && arr[j-1] % 2 == 0)){
    //                 curr++;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         res = Math.max(res, curr);
    //     }
    //     return res;
    // }

    public int maxEvenOdd(int arr[], int n) {
        int res = 0;
        int curr = 0;
        for(int i=1; i<n; i++) {
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) ||
            (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else{
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        EvenOddSubarray obj = new EvenOddSubarray();
        int arr[] = {10, 12, 14, 7, 8};
        System.out.println(obj.maxEvenOdd(arr, arr.length));
    }
}
