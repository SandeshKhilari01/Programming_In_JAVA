public class Fibonanci{
  public static int fib(int n){
    if(n == 1 || n == 0) return 1;
    return fib(n-1) + fib(n-2);
  }
  public static void main(String args[]){
    int n = 5;
    int ans = fib(n);
    System.out.print("Fibonanci of "+n+" : "+ans);
  }
}