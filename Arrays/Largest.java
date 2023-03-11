package Arrays;
public class Largest {
    public int getLargest(int arr[]) {
        int res = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Largest obj = new Largest();
        int arr[] = {5, 8, 20, 10};
        System.out.println(obj.getLargest(arr));
    }
}
