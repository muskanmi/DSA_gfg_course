package Bit_Magic;

public class PowerSet {
    public void printPowerSet(String s) {
        int n = s.length();
        int psize = (1 << n);
        for(int i=0; i<psize; i++){
            for(int j=0; j<n; j++) {
                if( (i & (1 << j)) != 0) {
                    System.out.println(s.charAt(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        PowerSet obj = new PowerSet();
        }
}
