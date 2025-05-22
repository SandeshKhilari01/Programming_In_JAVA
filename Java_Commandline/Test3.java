class Test3{
  public static void main(String args[]){
    int row = 3;
    
    //
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=i; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    
    //
    for(int i = row; i>=1; i--){
      for(int j = 1; j<i; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    
    //
    for(int i = 1; i<=row; i++){
      for(int j = row-1; j>=i; j--){
        System.out.print(" ");
      }
      for(int j = 1; j<=i; j++){
        System.out.print("*");
      }
      for(int j = 1; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    System.out.println();
    
    //
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = row-1; i>=1; i--){
      for(int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    System.out.println();
    
    
    for(int i = 1; i<=row; i++){
      for(int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j<= 2*i-1; j++){
        if(j == 1 || j == 2*i-1){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    for(int i = row; i>=1; i--){
      for(int j = 1; j<=row-i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1; j++){
        if(j == 1 || j== 2*i-1){
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}