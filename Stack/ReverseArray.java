package Stack;
class Stack {
 
    // Stores maximum count of
    // elements stored in a stack
    int size;
 
    // Stores index of top
    // element of a stack
    int top;
 
    // Stores address of
    // array element
    int[] a;
 
    // Function to check if
    // the stack is empty or not
    boolean isEmpty()
    {
        return (top < 0);
    }
 
    // Function to Initialize
    // a stack of given capacity.
    Stack(int n)
    {
        top = -1;
        size = n;
        a = new int[size];
    }
 
    // Function to push
    // an element into Stack
    boolean push(int x)
    {
 
        // If Stack is full
        if (top >= size) {
            System.out.println(
                "Stack Overflow");
            return false;
        }
        else {
 
            // Insert element
            // into stack
            a[++top] = x;
            return true;
        }
    }
 
    // Function to remove an element
    // from stack.
    int pop()
    {
 
        // If stack is empty
        if (top < 0) {
            System.out.println(
                "Stack Underflow");
            return 0;
        }
 
        // Pop element from stack
        else {
            int x = a[top--];
            return x;
        }
    }
}
public class ReverseArray {

    public static void reverse(int arr[], int n)
    {
 
        // Initialize a stack of capacity n
        Stack obj = new Stack(n);
 
        for (int i = 0; i < n; i++) {
 
            // Insert arr[i] into the stack
            obj.push(arr[i]);
        }
 
        // Reverse the array elements
        for (int i = 0; i < n; i++) {
 
            // Update arr[i]
            arr[i] = obj.pop();
        }
 
        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 4;
 
        // Create a new array
        int[] a = new int[] { 100, 200, 300, 400 };
 
        // Call reverse method
        reverse(a, n);
    }
}
