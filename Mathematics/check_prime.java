package Mathematics;

public class check_prime {
    boolean checkPrime(int n) {
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
    public static void main(String[] args) {
        check_prime obj = new check_prime();
        System.out.println(obj.checkPrime(65));
        System.out.println(obj.checkPrime(7));
    }
}
