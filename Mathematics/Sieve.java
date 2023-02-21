package Mathematics;

import java.net.SocketPermission;
import java.util.ArrayList;

public class Sieve {
    boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for(int i =2; i<n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    void printPrime(int n) {
        for(int i =2; i<= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }



    void eratos(int n) {
        boolean prime[] = new boolean[n + 1];
        for(int i=0; i<=n; i++) {
            prime[i] = true;
        }
        for(int i =2; i*i <= n; i++) {
            if(prime[i]) {
                for(int j = 2 * i; j <=n; j=j+i) {
                    prime[j] = false;
                }
            }
        }
        for(int i =2; i<=n; i++) {
            if(prime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Sieve obj = new Sieve();
        obj.printPrime(10);
        obj.eratos(10);
    }
}
