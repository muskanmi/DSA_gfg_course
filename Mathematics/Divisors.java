package Mathematics;

public class Divisors {
     void printDivisors(int n) {
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                System.out.println(i);
            }
        }
     }

     void printDivisor(int n) {
        for(int i=1; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i);
                if(i != n/i) {
                    System.out.println(n/i);
                }
            }
        }
     }   // print divisors but not in sorted order

     void print(int n) {
        int i;
        for(i =1; i*i < n; i++) {
            if(n%i == 0) {
                System.out.println(i);
            }
        }
        for(; i>=1; i--) {
            if(n%i == 0) {
                System.out.println(n/i);
            }
        }
     }
    public static void main(String[] args) {
        Divisors obj = new Divisors();
        obj.printDivisors(6);
        obj.printDivisor(15);
        obj.print(15);
    }
}
