package Mathematics;
public class Prime_factors {
    boolean checkPrime(int n) {
        if(n == 1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    void primeFactors(int n) {
        for(int i = 2; i<=n; i++) {
            if(checkPrime(i)){
                int x = n;
                while(x % i == 0){
                    System.out.println(i);
                    x = x / i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Prime_factors obj = new Prime_factors();
        obj.primeFactors(315);
        obj.primeFactors(13);
    }
}
