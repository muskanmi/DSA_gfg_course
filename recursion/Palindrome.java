package recursion;

public class Palindrome {
    boolean isPlaindrome(String str) {
        if(str.length() == 0 || str.length() == 1)
            return true; 
        //If string has multiple characters
        //Check whether first and last characters are same or not
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPlaindrome(str.substring(1, str.length()-1));
        return false;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        // obj.isPlaindrome("abbba");
        System.out.println(obj.isPlaindrome("abba"));
    }
}
