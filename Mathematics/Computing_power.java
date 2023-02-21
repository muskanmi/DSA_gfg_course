package Mathematics;

public class Computing_power {
    int power(int x, int n) {
        int res = 1;
        for(int i=0; i<n; i++) {
            res = res * x;
        }
        return res;
    }

    int pow(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int temp = pow(x, n/2);
        temp = temp * temp;
        if(n%2 == 0) {
            return temp;
        }
        else{
            return temp * x;
        }
    }
    public static void main(String[] args) {
        Computing_power obj = new Computing_power();
        System.out.println(obj.power(2, 3)); 
        System.out.println(obj.pow(3, 5));
    }
}
