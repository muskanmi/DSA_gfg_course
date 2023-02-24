package Recursion;

public class Output {
    // void fun(int n) {
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     fun(n-1);
    //     System.out.println(n);
    // }

    void fun(int n) {
        if(n==0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        Output obj = new Output();
        obj.fun(3);
    }
}
