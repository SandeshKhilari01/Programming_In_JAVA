public class longPalindrome{

    public static String expandAroundCenter(String s, int left, int right){

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--; 
            right++;
        }

        return s.substring(left+1, right);
    }
    public static void main(String args[]){
        String s = "babad";
        System.out.print(expandAroundCenter(s, 2, 2));
    }
}