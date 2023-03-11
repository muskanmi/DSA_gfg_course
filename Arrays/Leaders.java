package Arrays;

public class Leaders {
    // public void leaders(int arr[], int n) {
    //     for(int i=0; i<n; i++) {
    //         boolean flag = false;
    //         for(int j=i+1; j<n; j++) {
    //             if(arr[i] <= arr[j]) {
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if(flag == false){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

    public void leaders(int arr[], int n) {
        int temp = arr[n-1];
        System.out.print(temp + " ");
        for(int i=n-2; i>=0; i--) {
            if(temp < arr[i]){
                temp = arr[i];
                System.out.print(temp + " ");
            }
        }
    }
    public static void main(String[] args) {
        Leaders obj = new Leaders();
        int arr[] = {7, 10, 4, 3, 6, 5, 2};
        obj.leaders(arr, arr.length);
    }
}
