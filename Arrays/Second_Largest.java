package Arrays;

public class Second_Largest {

    // public int getLargest(int arr[], int n) {
    //     int res = 0;
    //     for(int i=1; i<arr.length; i++) {
    //         if(arr[i] > arr[res]) {
    //             res = i;
    //         }
    //     }
    //     return res;
    // }
    // public int getSecond(int arr[]) {
    //     int largest = getLargest(arr, arr.length);
    //     int res=-1;
    //     for(int i=1; i<arr.length; i++) {
    //         if(arr[i] != arr[largest]) {
    //             if(res == -1){
    //                 res=i;
    //             }
    //             else if(arr[i] > arr[res]){
    //                 res = i;
    //             }
    //         }
    //     }
    //     return res;
    // }


    public int secondLargest(int arr[], int n) {
        int res = -1; 
        int largest = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[largest]){
                res= largest;
                largest=i;
            }
            else if(arr[i] != arr[largest]) {
                if(res == -1 || arr[i] > arr[res]) {
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Second_Largest obj = new Second_Largest();
        int arr[] = {5, 8, 20, 10};
        System.out.println(obj.secondLargest(arr, arr.length));
    }
}
