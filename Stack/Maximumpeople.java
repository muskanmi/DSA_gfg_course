package Stack;

public class Maximumpeople {

    public static int leftindex(int[] heights, int idx,
                              int n)
  {
 
    int h = heights[idx];
    for (int i = idx - 1; i >= 0; i--) {
 
      // If height of person i is
      // greater than or equal to
      // current person of height h
      // then the current person(idx)
      // cannot see him
      if (heights[i] >= h)
        return i;
    }
    // If a person can see all other people
    // who are standing on his left
    return -1;
  }

    public static int rightindex(int[] heights, int idx,
    int n)
{
int h = heights[idx];
for (int i = idx + 1; i < n; i++) {

// If height of person i is
// greater than or equal to
// current person of height h
// then the current person(idx)
// cannot see him
if (heights[i] >= h)
return i;
}

// If a person can see all other people
// who are standing on his right
return n;
}

    public static int max_people(int[] heights, int n)
  {
 
    // Ans stores the maximum of people
    // a person can see
    int ans = 0;
    for (int i = 0; i < n; i++) {
 
      // Leftptr stores the leftmost index
      // of the person which
      // the current person cannot see
      int leftptr = leftindex(heights, i, n);
 
      // Rightptr stores the rightmost index
      // of the person which
      // the current person cannot see
      int rightptr = rightindex(heights, i, n);
 
      // Maximum number of people
      // a person can see
      ans = Math.max(ans, rightptr - leftptr - 1);
    }
    return ans;
  }
    public static void main(String[] args) {
        int N = 7;
    int[] heights = new int[] { 6, 2, 5, 4, 5, 1, 6 };
 
    // Function call
    System.out.println(max_people(heights, N));
    }
}
