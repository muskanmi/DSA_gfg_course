package Stack;

public class CustomBrowser {

    static class BrowserHistory {
        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();
     
        // Constructor to initialize object with
        // homepage
        BrowserHistory(String homepage)
        {
          backStack.push(homepage);
        }
     
        // Visit current url
        void visit(String url)
        {
          while (!forwardStack.isEmpty()) {
            forwardStack.pop();
          }
          backStack.push(url);
        }
     
        // 'steps' move backward in history and
        // return current page
        String back(int steps)
        {
          while (backStack.size() > 1 && steps-- > 0) {
            forwardStack.push(backStack.peek());
            backStack.pop();
          }
          return backStack.peek();
        }
     
        // 'steps' move forward and return
        // current page
        String forward(int steps)
        {
          while (!forwardStack.isEmpty() && steps-- > 0) {
            backStack.push(forwardStack.peek());
            forwardStack.pop();
          }
          return backStack.peek();
        }
      }
    public static void main(String[] args) {
        String homepage = "gfg.org";
 
    // Initialise the object of Browser History
    BrowserHistory obj = new BrowserHistory(homepage);
 
    String url = "google.com";
    obj.visit(url);
 
    url = "facebook.com";
    obj.visit(url);
 
    url = "youtube.com";
    obj.visit(url);
 
    System.out.println(obj.back(1));
    System.out.println(obj.back(1));
    System.out.println(obj.forward(1));
    obj.visit("linkedin.com");
    System.out.println(obj.forward(2));
    System.out.println(obj.back(2));
    System.out.println(obj.back(7));
    }
}
