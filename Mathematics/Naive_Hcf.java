package Mathematics;

public class Naive_Hcf {

    // int gcd(int a, int b){
    //     int res =  Math.min(a, b);
    //     while(res  > 0) {
    //         if(a % res == 0 && b % res == 0) {
    //              break;
    //         }
    //         res--;
    //     }
    //     return res;
    // }
    
    public static void main(String[] args) {
        System.out.println("abc ");
        // Hcf obj = new Hcf();
        // System.out.println(obj.gcd(15, 30));
        // System.out.println(obj.gcd(7, 13));

        int a = 15;
        int b = 30;
        for(int i=1; i<=a && i <= b; i++) {
            if(15 % i == 0 && 30 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
