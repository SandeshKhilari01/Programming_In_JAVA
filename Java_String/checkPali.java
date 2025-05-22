public class checkPali{
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("It is Not a Palindrome");
                return false;
            }
        }
        System.out.println("It is a Palindrome");
        return true;
    }
    public static void main(String[] args){
        String str = ("MAAM");
        isPalindrome(str);
    }
}