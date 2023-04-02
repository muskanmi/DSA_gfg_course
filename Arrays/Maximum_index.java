package Arrays;

public class Maximum_index {

    int maxIndexDiff(int arr[], int n)
    {
        int maxDiff = -1;
        int i, j;
  
        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }
  
        return maxDiff;
    }
    public static void main(String[] args) {
        Maximum_index max = new Maximum_index();
        int arr[] = { 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
        int n = arr.length;
        int maxDiff = max.maxIndexDiff(arr, n);
        System.out.println(maxDiff);
    }
}
