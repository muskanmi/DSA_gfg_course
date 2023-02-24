package Recursion;

public class Josephus {
    int jos(int n, int k) {
        if(n==1){
            return 0;
        }
        return (jos(n-1, k) + k) % n; // main logic
    }
    public static void main(String[] args) {
        Josephus obj = new Josephus();
        System.out.println(obj.jos(5, 3)
        );
    }
}
