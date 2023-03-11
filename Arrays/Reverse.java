package Arrays;

public class Reverse {
    void reverse(int arr[]) {
        // for(int i=arr.length-1; i>=0; i--) {
        //     System.out.print(arr[i] + " ");
        // }
        // OR
        int low =0, high=arr.length-1;
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        int arr[] = {10, 5, 7, 30};
        obj.reverse(arr);
    }
}
