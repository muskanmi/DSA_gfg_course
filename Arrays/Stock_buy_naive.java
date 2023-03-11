package Arrays;

public class Stock_buy_naive {

    public int maxProfit(int arr[], int start, int end) {
        if( end <= start) {
            return 0;
        }
        int profit=0;
        for(int i=start; i<end; i++) {
            for(int j=start+1; j<end; j++) {
                if(arr[j] > arr[i]) {
                    int curr_profit = arr[j] - arr[i] +
                    maxProfit(arr, start, i-1) +
                    maxProfit(arr, j+1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Stock_buy_naive obj = new Stock_buy_naive();
        int arr[] = {1, 5, 3, 8, 12};
        System.out.println(obj.maxProfit(arr, 0, arr.length));
    }
}
