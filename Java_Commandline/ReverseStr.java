class ReverseStr{
  public static void main(String agrs[]){
    String s = "ABCD";
    String ans = "";
    for(int i = 0; i<s.length(); i++){
      ans = s.charAt(i) + ans;
    }
    System.out.println(ans);
  }
}