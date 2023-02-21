package Mathematics;

public class Naive_Lcm {
    // int findLcm(int a, int b) {
    //     int res = Math.max(a, b);
    //     while(true) {
    //         if(res%a == 0 && res%b == 0) {
    //             return res;
    //         }
    //         res++;
    //     }
    // }

    //efficient solution
    int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b); 
    }
    int findLcm(int a, int b) {
        return (a*b) / gcd(a,b);
    }
    public static void main(String[] args) {
        Naive_Lcm obj = new Naive_Lcm();
        System.out.println(obj.findLcm(4, 6));
    }
}
