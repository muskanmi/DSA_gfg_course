package recursion;

public class Sum {
    int fun(int n) {
        if(n == 0){
            return 0;
        }
        return n * (n+1) / 2;
    }
    public static void main(String[] args) {
        Sum obj = new Sum();
        // obj.fun(5);
        System.out.println(obj.fun(5));
    }
}
