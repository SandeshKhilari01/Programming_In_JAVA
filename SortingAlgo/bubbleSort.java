public class bubbleSort{
    public static void BubbleSort(int numbs[]){
        for(int i=0; i<numbs.length-1;i++){
            for(int j=0; j<numbs.length-1-i; j++){
               if(numbs[j]>numbs[j+1]){
                  int temp = numbs[j];
                  numbs[j] = numbs[j+1];
                  numbs[j+1] = temp;
               }
               
            }
        }
    }
    public static void printArr(int numbs[]){
       for(int i=0; i<numbs.length; i++){
          System.out.print(numbs[i]+" ");
       }
    }
    public static void main(String[] args){
        int numbs[] = {5,4,3,2,6,1};
        BubbleSort(numbs);
        printArr(numbs);

    }
}