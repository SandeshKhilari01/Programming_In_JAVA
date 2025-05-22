class Pattern{
  public static void main(String args[]){
    int row = 5;
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
    System.out.println();
    
    for(int i = row; i>=1; i--){
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    
    for(int i = row-1; i>=1; i--){
      for(int j = 1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    int i, j;
    for(i = 0; i<=row; i++){
      for(j = 2*(row-i); j>0; j--){
        System.out.print(" ");
      }
      for(j = 0; j<i; j++){
        System.out.print(" *");
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    int k = 0;
    for(i = 1; i<=row; ++i, k=0){
      for(j = 1; j<=row - i; j++){
        System.out.print("  ");
      }
      while(k!=2*i - 1){
        System.out.print(" *");
        ++k;
      }
      System.out.println();
    }
  }
}