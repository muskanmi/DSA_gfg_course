package Bit_Magic;

public class Count_Bits {
    // Brian kerningams algorithm
    int countSetBits(int n) {
        int res= 0;
        while( n > 0) {
            n = n & (n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Count_Bits obj = new Count_Bits();
        System.out.println(obj.countSetBits(5));
    }
}
