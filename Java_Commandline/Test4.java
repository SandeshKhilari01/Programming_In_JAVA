class Test4{
  public static String rev(String str){
    if(str == null || str.length() <= 1) return str;
    return rev(str.substring(1)) + str.charAt(0);
  }
  public static void main(String args[]){
    String s = "ABCD";
    String ans = rev(s);
    System.out.println(ans);
  }
}