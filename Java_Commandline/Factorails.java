class Factorails{
  public static int fact(int n){
    if(n <= 1) return n;
    return fact(n-1) * n;
  }
  public static void main(String args[]){
    int n = 5;
    int factorial = fact(n);
    System.out.println(factorial);
  }
}