package Stack;

public class CountSubarrays {

    public static int min_element(int arr[], int left, int right)
    {
        int x = Integer.MAX_VALUE;
        for(int i=left;i<right;i++)
        {
            x=Math.min(x,arr[i]);
        }
        return x;
    }

    public static int countSubarrays(int arr[])
    {
        int n = arr.length;
         
        // Cnt is initialised to n because
        // atleast n subarrays will be there
        // which is single element itself
        int cnt = n;
         
        // Two loops to find the
        // ending of each subarrays
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                // Minimum element from
                // [start+1, end] of each subarray
                int mini_ele = min_element(arr,i+1,j+1);
                 
                // Checking if minimum of
                // elements from [start+1, end] is
                // not smaller than start element
                // updating the count of subarrays
                if (mini_ele >= arr[i])
                cnt++;
            }
        }
         
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2};
         
        // Function call
        System.out.println(countSubarrays(arr) );
    }
}
