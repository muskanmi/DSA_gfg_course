package Arrays;

public class Move0 {
    // public void zeroes_end(int arr[]) {
    //     int res=0;
    //     int temp[] = new int[arr.length];
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] != 0) {
    //             temp[res] = arr[i];
    //             res++;
    //         }
    //     }
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == 0) {
    //             temp[res] = arr[i];
    //             res++;
    //         }
    //     }

    //     for(int i=0; i<res; i++) {
    //         arr[i] = temp[i];
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    public void moveZeroes(int arr[], int n) {
        int count=0;
        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                // swap(arr[i], arr[count]);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Move0 obj = new Move0();
        int arr[] = {8, 5, 0, 10, 0, 20};
        obj.moveZeroes(arr, arr.length);
    }
}
