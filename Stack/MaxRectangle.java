package Stack;

public class MaxRectangle {

    public static int[] nextsmallerelement(int[] arr, int n)
  {
 
    Stack<Integer> st = new Stack<>();
 
    // For the elements which dont have
    // next smaller element ans will be -1
    st.push(-1);
 
    // Store indices in output
    int[] right  = new int[n];
 
    // Start from last index
    for (int i = n - 1; i >= 0; i--) {
 
      // If top element is sorted then
      // no need to do anything, just store
      // the answer and push the
      // current element in stack
      if ((st.peek() != -1)
          && arr[st.peek()] < arr[i]) {
        right[i] = st.peek();
        st.push(i);
      }
      else {
        while ((st.peek() != -1)
               && arr[st.peek()]
               >= arr[i]) {
          st.pop();
        }
        right[i] = st.peek();
        st.push(i);
      }
    }
    return right;
  }

    public static int[] previousmallerelement(int arr[],int n)
    {
      Stack<Integer> st = new Stack<>();
      st.push(-1);
   
      int[] left  = new int[n];
   
      // Start from first index - Difference Between Next and Previous Smaller element
      for (int i = 0; i < n; i++) {
        if ((st.peek() != -1)
            && arr[st.peek()] < arr[i]) {
          left[i] = st.peek();
          st.push(i);
        }
        else {
          while ((st.peek() != -1)
                 && arr[st.peek()]
                 >= arr[i]) {
            st.pop();
          }
          left[i] = st.peek();
          st.push(i);
        }
      }
      return left;
    }
    public static int getMaxArea(int [] arr, int n)
  {
    int [] right = new int [n];
    right = nextsmallerelement(arr, n);
 
    // Find the smallest element than
    // curr element in right side
 
    int [] left = new int [n];
    left = previousmallerelement(arr, n);
 
    // Find the smallest element
    // than curr element in left side
    int maxarea = Integer.MIN_VALUE;
 
    // Now the left and right array have
    // index of smallest element in left and
    // right respectively, thus the difference
    // of right - left - 1 will give us
    // breadth and thus
    // area = height(curr==arr[i]) * breadth;
    for (int i = 0; i < n; i++) {
      int height = arr[i];
      if (right[i] == -1) {
        right[i] = n;
      }
      int breadth = right[i] - left[i] - 1;
      maxarea = Math.max(maxarea,
                         height * breadth);
    }
    return maxarea;
  }

    public static int maxRectangleArea(int [][] M, int R, int C)
    {
      int area = getMaxArea(M[0], R);
      int maxarea = area;
   
      for (int i = 1; i < R; i++) {
        for (int j = 0; j < C; j++) {
          if (M[i][j] != 0) {
   
            // Add heights of previous rows
            // into current
            M[i][j] = M[i][j]
              + M[i - 1][j];
          }
          else {
   
            // If current height is 0 then
            // don't add previous heights
            M[i][j] = 0;
          }
        }
        maxarea = Math.max(maxarea,
                           getMaxArea(M[i], R));
      }
      return maxarea;
    }
    public static void main(String[] args) {
        int R = 4, C = 4;
        int [][]amt = {
          { 0, 1, 1, 0 },
          { 1, 1, 1, 1 },
          { 1, 1, 1, 1 },
          { 1, 1, 0, 0 },
        };
        System.out.println(maxRectangleArea(amt, R, C));
    }
}
