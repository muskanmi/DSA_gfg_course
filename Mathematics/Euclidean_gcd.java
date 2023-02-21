package Mathematics;

public class Euclidean_gcd {
    int gcd(int a, int b){
        while(a != b) {
            if (a > b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Euclidean_gcd obj = new Euclidean_gcd();
        System.out.println(obj.gcd(12, 15));
        System.out.println(obj.gcd(7, 13));
    }
}
 