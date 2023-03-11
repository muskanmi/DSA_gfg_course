package Arrays;

public class Majority {
    // public int findMajority(int arr[], int n) {
    //     for(int i=0; i<n; i++) {
    //         int count = 1;
    //         for(int j=i+1; j<n; j++) {
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > n/2) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int findMajority(int arr[], int n) {
        int res=0, count=1;
        for(int i=1; i<n; i++) {
            if(arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if(count == 0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0; i<n; i++) {
            if(arr[res] == arr[i]) {
                count++;
            }
        }
        if(count <= n/2) {
            res=-1;
        }
        return res;
    }
    public static void main(String[] args) {
        Majority obj = new Majority();
        int arr[] = {8, 3, 4, 8, 8};
        System.out.println(obj.findMajority(arr, arr.length));
    }
}
