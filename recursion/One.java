package recursion;

public class One {
    void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        One obj = new One();
        obj.fun(5);
    }
}
