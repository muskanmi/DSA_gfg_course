package Stack;

public class CloneStack {

    static Stack<Integer> S = new Stack<Integer>();
    static Stack<Integer> Des = new Stack<Integer>(); // Stores the destination stack
      
    // Auxiliary function to copy elements
    // of source stack to destination stack
    static void RecursiveCloneStack()
    {
       
        // Base case for Recursion
        if (S.size() == 0)
            return;
        
        // Stores the top element of the
        // source stack
        int val = S.peek();
        
        // Removes the top element of the
        // source stack
        S.pop();
        
        // Recursive call to the function
        // with remaining stack
        RecursiveCloneStack();
        
        // Push the top element of the source
        // stack into the Destination stack
        Des.push(val);
    }
    
    static void cloneStack()
    {
        // Recursive function call to copy
        // the source stack to the
        // destination stack
        RecursiveCloneStack();
        
        System.out.print("Destination:- ");
        int f = 0;
        
        // Iterate until stack Des is
        // non-empty
        while (Des.size() > 0) {
        
            if (f == 0) {
                System.out.print(Des.peek());
                f = 1;
            }
        
            else
                System.out.print("              " + Des.peek());
            Des.pop();
        
            System.out.println();
        }
    }
    public static void main(String[] args) {
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        cloneStack();
    }
}
