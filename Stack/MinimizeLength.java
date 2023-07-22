package Stack;

public class MinimizeLength {

    public static void deleteSubseq(String s)
    {
   
      // Length of the string
      int N = s.length();
   
      // Stores opening parenthesis
      // '(' of the given string
      Stack<Character> roundStk = new Stack<>();
   
      // Stores square parenthesis
      // '[' of the given string
      Stack<Character> squareStk = new Stack<>();
   
      // Stores count of opening parenthesis '('
      // in valid subsequences
      int roundCount = 0;
   
      // Stores count of opening parenthesis '['
      // in valid subsequences
      int squareCount = 0;
   
      // Iterate over each
      // characters of S
      for (int i = 0; i < N; i++)
      {
   
        // If current character is '['
        if (s.charAt(i) == '[')
        {
   
          // insert into stack
          squareStk.push(s.charAt(i));
        }
   
        // If i is equal to ']'
        else if (s.charAt(i) == ']')
        {
   
          // If stack is not empty and
          // top element of stack is '['
          if (squareStk.size() != 0
              && squareStk.peek() == '[')
          {
   
            // Remove top element from stack
            squareStk.pop();
   
            // Update squareCount
            squareCount += 1;
          }
        }
   
        // If current character is '('
        else if (s.charAt(i) == '(')
        {
   
          // Insert into stack
          roundStk.push(s.charAt(i));
        }
   
        // If i is equal to ')'
        else
        {
   
          // If stack is not empty and
          // top element of stack is '('
          if (roundStk.size() != 0
              && squareStk.peek() == '(')
          {
   
            // Remove top element from stack
            squareStk.pop();
   
            // Update roundCount
            roundCount += 1;
          }
        }
      }
   
      // Print the minimum number of remaining
      // characters left into S
      System.out.println(
        N - (2 * squareCount + 2 * roundCount));
    }
    public static void main(String[] args) {
        String s = "[]])([";
 
    // function call
    deleteSubseq(s);
    }
}
