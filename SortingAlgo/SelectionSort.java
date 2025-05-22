public class SelectSort{
    public static void SelectionSort(int numbs[]){
    for(int i=0; i<numbs.length; i++){
       int minpos = i;
       for(int j=i+1; j<numbs.length; j++){
          if(numbs[minpos]>numbs[j]){
             numbs[minpos] = numbs[j];
             }
          }
       }
       int temp = numbs[minpos];
       numbs[minpos] = numbs[i];
       numbs[i] = temp;
    }
    public static void printArr(int numbs[]){
       for(int i=0; i<numbs.length; i++){
         System.out.print(numbs[i]+" ");
       }
    }
    public static void main(String[] args){
       int numbs[] = {5,2,3,1,4};
       SelectionSort(numbs);
       printArr(numbs);

    }
}