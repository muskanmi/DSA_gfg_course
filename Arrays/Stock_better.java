package Arrays;

public class Stock_better {
    public int maxProfit(int arr[], int n){
        int profit=0;
        for(int i=1; i<n; i++) {
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Stock_better obj = new Stock_better();
        int arr[] = {1, 5, 3, 8, 12};
        System.out.println(obj.maxProfit(arr, arr.length));
    }
}
