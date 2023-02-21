package Mathematics;

public class IterativePower {
    int power(int x, int n) {
        int res = 1;
        while(n > 0) {
            if(n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        IterativePower obj = new IterativePower(); 
        System.out.println(obj.power(4, 5));
    }
}
