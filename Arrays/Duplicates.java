package Arrays;

public class Duplicates {
    public int remove(int arr[], int n) {
        int[] temp = new int[n];
        int res=1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=1; i<temp.length; i++) {
            arr[i] = temp[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Duplicates obj = new Duplicates();
        int arr[] = {10, 20, 20, 30, 30, 30, 30};
        System.out.println(obj.remove(arr, arr.length));

    }
}
