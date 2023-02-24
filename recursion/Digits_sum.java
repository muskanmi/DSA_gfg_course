package Recursion;

public class Digits_sum {
    int fun(int n) {
        if( n == 0){
            return 0;
        }
        return fun(n/10) + n%10;
    }
    public static void main(String[] args) {
        Digits_sum obj = new Digits_sum();
        // obj.fun(253);
        System.out.println(obj.fun(253));
    }
}
