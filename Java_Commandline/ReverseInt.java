class ReverseInt{
  public static int rev(int n, int i){
    if(n == 0){
      return 0;
    }
    else{
      i = i * 10 + n %10;
      return i += rev(n/10, i);
    }
  }
  public static void main(String args[]){
    int n = 123;
    int ans = rev(n, 0);
    System.out.print("Reverse of "+n+" is : "+ans);
  }
}