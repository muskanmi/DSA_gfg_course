package Bit_Magic;

import java.net.SocketPermission;

public class Check_kth_bit {
    public void isBitSet(int n, int k){
        if((n & (1 << k)) != 0) {
            System.out.println("The bit is set");
        }
        else{
            System.out.println("The bit is not set");
        }
    }
    public static void main(String[] args) {
        Check_kth_bit obj = new Check_kth_bit();
        obj.isBitSet(45, 2);
    }
}
