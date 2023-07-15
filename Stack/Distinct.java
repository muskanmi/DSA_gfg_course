package Stack;

import java.util.HashSet;

public class Distinct {

    static int DistinctR(int[] arr, int n)
  {
    HashSet<Integer> dist = new HashSet<Integer>();
    int firstMax, secondMax;
 
    for(int i = 0; i < n - 1; i++)
    {
      firstMax = arr[i];
      secondMax = Integer.MIN_VALUE;
 
      for(int j = i + 1; j < n; j++){
 
        if(firstMax < arr[j])
        {
          secondMax = firstMax;
          firstMax = arr[j];
        }
        else if(secondMax < arr[j])
          secondMax = arr[j];
 
        dist.add(firstMax-secondMax);
      }
    }
 
    return dist.size();
  }
    public static void main(String[] args) {
        int arr[] = {5,1,3};
    int n = arr.length;
    System.out.println(DistinctR(arr, n));
    }
}
