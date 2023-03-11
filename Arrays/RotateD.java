package Arrays;

public class RotateD {
    public void rotateOne(int arr[], int n) {
        int temp = arr[0];
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    // public void rotateByD(int arr[], int n, int d) {
    //     for(int i=0; i<d; i++){
    //         rotateOne(arr, n);
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // Better Solution
    public void rotateByD(int arr[], int n, int d) {
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++) {
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++) {
            arr[n-d+i] = temp[i];
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        RotateD obj = new RotateD();
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        obj.rotateByD(arr, arr.length, d);
    }
}
