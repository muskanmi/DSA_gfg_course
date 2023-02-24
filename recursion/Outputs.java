package Recursion;

public class Outputs {
    // int fun(int n) {
    //     if(n == 1) {
    //         return 0;
    //     }
    //     else{
    //         return 1 + fun(n/2);
    //     }
    // }

    void fun(int n) {
        if(n==0) {
            return;
        }
        fun(n/2);
        System.out.println(n%2);
    }
    public static void main(String[] args) {
        Outputs obj = new Outputs();
        // System.out.println(obj.fun(16));
        obj.fun(7 );
    }
}
