package Recursion;

public class Two {
    void fun(int n) {
        if(n==0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Two obj = new Two();
        obj.fun(5);
    }
}
