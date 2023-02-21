package Bit_Magic;

public class Odd_element {
    //naive solution
    // int findOdd(int arr[], int n) {
    //     for(int i= 0; i<n; i++) {
    //         int count = 0;
    //         for(int j = 0; j<n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count %2 != 0){
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }

    //efficient solution
    int findOdd(int arr[], int n){
        int res = arr[0];
        for(int i=1; i<n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Odd_element obj = new Odd_element();
        // obj.findOdd([4,4,7,4,8,7,7,7,8], 9)
    }
}
