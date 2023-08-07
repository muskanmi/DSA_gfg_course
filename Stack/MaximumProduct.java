package Stack;

public class MaximumProduct {


    static int MAX = 1000;

    static int[] nextGreaterInLeft(int []a,
    int n)
{
int []left_index = new int[MAX];
Stack<Integer> s = new Stack<Integer>();

for (int i = n - 1; i >= 0; i--)
{

// checking if current
// element is greater than top
while (s.size() != 0 &&
a[i] > a[s.peek() - 1])
{
int r = s.peek();
s.pop();

// on index of top store
// the current element
// index which is just
// greater than top element
left_index[r - 1] = i + 1;
}

// else push the current
// element in stack
s.push(i + 1);
}
return left_index;
}

    static int[] nextGreaterInRight(int []a,
                                    int n)
    {
        int []right_index = new int[MAX];
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
     
            // checking if current element
            // is greater than top
            while (s.size() != 0 &&
                        a[i] > a[s.peek() - 1])
            {
                int r = s.peek();
                s.pop();
     
                // on index of top store
                // the current element index
                // which is just greater than
                // top element stored index
                // should be start with 1
                right_index[r - 1] = i + 1;
            }
     
            // else push the current
            // element in stack
            s.push(i + 1);
        }
        return right_index;
    }

    static int LRProduct(int []arr, int n)
    {
         
        // for each element storing
        // the index of just greater
        // element in left side
        int []left = nextGreaterInLeft(arr, n);
     
        // for each element storing
        // the index of just greater
        // element in right side
        int []right = nextGreaterInRight(arr, n);
        int ans = -1;
        for (int i = 1; i <= n; i++)
        {
     
            // finding the max
            // index product
            ans = Math.max(ans, left[i] *
                                right[i]);
        }
     
        return ans;
    }
    public static void main(String[] args) {
        int []arr = new int[]{ 5, 4, 3, 4, 5 };
        int n = arr.length;
     
        System.out.print(LRProduct(arr, n));
    }
}
