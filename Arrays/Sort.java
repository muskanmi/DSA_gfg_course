package Arrays;

import Mathematics.check_prime;

public class Sort {
    public boolean check_sort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Sort obj = new Sort();
        int arr[] = {200, 20, 100};
        System.out.println(obj.check_sort(arr));
    }
}
