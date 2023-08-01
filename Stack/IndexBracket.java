package Stack;

public class IndexBracket {

    static void test(String expression, int index) {
        int i;
 
        // If index given is invalid and is
        // not an opening bracket.
        if (expression.charAt(index) != '[') {
            System.out.print(expression + ", "
                    + index + ": -1\n");
            return;
        }
 
        // Stack to store opening brackets.
        Stack<Integer> st = new Stack<>();
 
        // Traverse through string starting from
        // given index.
        for (i = index; i < expression.length(); i++) {
 
            // If current character is an
            // opening bracket push it in stack.
            if (expression.charAt(i) == '[') {
                st.push((int) expression.charAt(i));
            } // If current character is a closing
            // bracket, pop from stack. If stack
            // is empty, then this closing
            // bracket is required bracket.
            else if (expression.charAt(i) == ']') {
                st.pop();
                if (st.empty()) {
                    System.out.print(expression + ", "
                            + index + ": " + i + "\n");
                    return;
                }
            }
        }
 
        // If no matching closing bracket
        // is found.
        System.out.print(expression + ", "
                + index + ": -1\n");
    }
    public static void main(String[] args) {
        test("[ABC[23]][89]", 0); // should be 8
        test("[ABC[23]][89]", 4); // should be 7
        test("[ABC[23]][89]", 9); // should be 12
        test("[ABC[23]][89]", 1); // No matching bracket
    }
}
