package Arrays;

public class Max_ones {
    // public int maxOnes(int arr[], int n){
    //     int res=0;
    //     for(int i=0; i<n; i++) {
    //         int count=0;
    //         for(int j=i; j<n; j++){
    //             if(arr[j] == 1){
    //                 count++;
    //             } else{
    //                 break;
    //             }
    //         }
    //         res = Math.max(res, count);
    //     }
    //     return res;
    // }

    public int maxOnes(int arr[], int n) {
        int res=0;
        int curr = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0) {
                curr=0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Max_ones obj = new Max_ones();
        int arr[] = {0, 1, 1, 0, 1, 0};
        System.out.println(obj.maxOnes(arr, arr.length));
    }
}
