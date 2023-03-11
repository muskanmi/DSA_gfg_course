package recursion;

public class Lucky {
    boolean isLucky(int n){
        int counter = 2;
        if(counter > n) {
            return true;
        }
        if(n%counter == 0) {
            return false;
        }
        int np = n;
        np = np - np / counter;
        counter++;
        return isLucky(np);
    }
    public static void main(String[] args) {
        Lucky obj = new Lucky();
        System.out.println(obj.isLucky(13));
    }
}
