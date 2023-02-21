package Bit_Magic;

public class Power_Two {
    // naive solution
    // boolean isPow2(int n) {
    //     if(n==0){
    //         return false;
    //     }
    //     while(n != 1){
    //         if(n%2 != 0){
    //             return false;
    //         }
    //         n = n/2;
    //     }
    //     return true;
    // }

    //brian kerningams
    boolean isPow2(int n){
        if(n==0){
            return false;
        }
        return ((n & (n-1)) == 0);
    }
    public static void main(String[] args) {
        Power_Two obj = new Power_Two();
        System.out.println(obj.isPow2(6));
        System.out.println(obj.isPow2(4));
    }
}
